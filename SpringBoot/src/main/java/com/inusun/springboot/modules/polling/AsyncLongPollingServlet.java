package com.inusun.springboot.modules.polling;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * (异步) servlet实现长轮询
 * <p>
 * 参考: <a href="http://mp.weixin.qq.com/s?__biz=MzA4ODIyMzEwMg==&mid=2447536702&idx=1&sn=10749a4955d2139a010b60dae01a6101&chksm=843bae2fb34c2739277a1596f8dea811b1fa301ce65d2028c167113ef5e6f33b135dc082e39e&scene=21#wechat_redirect">《Spring Boot使用Servlet居然也可以实现长轮询》</a>
 */
// 1. asyncSupported = true 开启异步支持, 以便支持通过异步线程返回HTTP 200 OK
@WebServlet(urlPatterns = {"/asyncLongPollingServlet"}, asyncSupported = true)
public class AsyncLongPollingServlet extends HttpServlet {
    public static String message = "welcome";

}
