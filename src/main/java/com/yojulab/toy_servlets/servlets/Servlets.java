package com.yojulab.toy_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.yojulab.toy_servlets.dao.PollWithDB;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pollWithDBServlets")
public class Servlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // biz with DB
        PollWithDB simpleWithDB = new PollWithDB();
        // 값 가져오기
        ArrayList<HashMap> bundle_list = PollWithDB.getList();

        // display
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<div>SimpleWithDBServlets</div>");

        for (int i = 0; i < bundle_list.size(); i++) {
            if (i <= 0) {
                HashMap<String, Object> bundle = bundle_list.get(i);
                HashMap<String, Object> question = (HashMap<String, Object>) bundle.get("question");
                int orders = (int) question.get("ORDERS");
                String questions = (String) question.get("QUESTIONS");
                printWriter
                        .println("<div>" + orders + ". " + questions
                                + "' / ></div>");

                ArrayList<HashMap> example = (ArrayList<HashMap>) bundle.get("example_list");
                for (int j = 0; j < example.size(); j++) {
                    HashMap examples = example.get(j);
                    String answers = (String) examples.get("EXAMPLE");
                    String questions_uid = (String) question.get("QUESTIONS_UID");
                    String example_uid = (String) examples.get("EXAMPLE_UID");
                    printWriter.println("<div>" + answers + "</div>");
                }
                printWriter.println("<button onclick=''>prev</button>");
            }

        }

        printWriter.close();

    }

}