package com.inusun.test.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SpringBootTest
public class a {

    @Test
    public void test_01() {
        String str = "SELECT\n"
                + "       dmr.id,dmr.doctor_id,dmr.patient_id,dmr.status,dmr.invalid,dmr.buy_status,dmr.drug_type,dmr.syndrome\n"
                + "     ,dmr.disease,dmr.diagnosis,dmr.warehouse_id,dmr.inquirer_id,dmr.resource_channel,dmr.created_at,dmr.expire_at\n"
                + "     ,p.name as 'patient_name',p.head_url,pii.name as 'inquirer_name'\n"
                + "     ,pii.gender,pii.birthday\n"
                + "     ,eo.pay_status,eo.real_pay\n"
                + "FROM dr_medication_recom as dmr\n"
                + "    LEFT JOIN patient p on dmr.patient_id = p.id\n"
                + "    LEFT JOIN patient_inquirer_info pii on dmr.inquirer_id = pii.id\n"
                + "    LEFT JOIN e_order eo on dmr.id = eo.recom_id\n"
                + "    LEFT JOIN dr_medication_recom_info  dmri on p.id = dmri.recommend_id\n"
                + "WHERE\n"
                + "      dmr.doctor_id=45\n"
                + "  and dmri.doctor_sign_status=1\n"
                + "  and (dmr.status=0 OR dmr.status=2 or (dmr.status=1 and eo.pay_status=0)) and dmr.expire_at > now()\n"
                + "#   AND dmr.status=1 and eo.pay_status=1\n"
                + "#   AND dmr.expire_at < now() and dmr.status <> 1 or (dmr.status=1 and eo.pay_status=2)\n"
                + "ORDER BY dmr.created_at DESC\n"
                + ";";

        System.out.println(str);
    }

    @Test
    public void test_02() {
        boolean a = true;
        Boolean b = Boolean.TRUE;
        System.out.println(b);

    }

    @Test
    public void test_03() {
        String fileName = "C:\\Users\\Inusun\\Desktop\\临时\\temp_local_production.html";
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
        }
    }
}
