//package com.bobocode.demo.servlet;
//
//import com.bobocode.demo.client.NasaPicturesClient;
//import com.bobocode.demo.config.DemoAppConfig;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/nasa/pictures")
//public class NasaPicturesServlet extends HttpServlet {
//    private static final String ROOT_CONTEXT = "ROOT_CONTEXT";
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        var springContext = new AnnotationConfigApplicationContext(DemoAppConfig.class);
//        var servletContext = config.getServletContext();
//        servletContext.setAttribute(ROOT_CONTEXT, springContext);
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        var springContext = req.getServletContext().getAttribute(ROOT_CONTEXT);
//        var appContext =((ApplicationContext)springContext);
//        var client = appContext.getBean(NasaPicturesClient.class);
//        var writer = resp.getWriter();
//        client.getAllPicturesUrl()
//                .forEach(writer::println);
//    }
//}
