package com.yojulab.toy_servlets.poll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.yojulab.toy_servlets.dao.PollWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/detailServlets")
public class DetailServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // biz with DB
        PollWithDB pollWithDB = new PollWithDB();
        // 값 가져오기
        ArrayList<HashMap> bundle_list = pollWithDB.getList();
        request.setAttribute("bundle_list", bundle_list);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/poll/details.jsp");
        requestDispatcher.forward(request, response);

    }

}
