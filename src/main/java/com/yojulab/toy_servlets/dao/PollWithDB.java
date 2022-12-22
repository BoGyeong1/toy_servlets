package com.yojulab.toy_servlets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class PollWithDB {

    // DB에서 질문 가져오기
    public HashMap<String, Object> getQuestion(String questionsUid) throws SQLException {

        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT * FROM QUESTIONS_LIST " +
                " WHERE QUESTIONS_UID='" + questionsUid + "'";

        ResultSet reseltSet = statement.executeQuery(query);
        HashMap<String, Object> result = null;
        while (reseltSet.next()) {
            result = new HashMap<>();
            result.put("QUESTIONS_UID", reseltSet.getString("QUESTIONS_UID"));
            result.put("QUESTIONS", reseltSet.getString("QUESTIONS"));
            result.put("ORDERS", reseltSet.getInt("ORDERS"));

        }

        return result;
    }

    // DB에서 답항 가져오기
    public ArrayList<HashMap> getExamples(String questionsUid) throws SQLException {

        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT example_list.EXAMPLE_UID, example_list.EXAMPLE, example_list.ORDERS " +
                "FROM answers inner Join example_list " +
                " on answers.EXAMPLE_UID = example_list.EXAMPLE_UID " +
                " WHERE QUESTIONS_UID = '" + questionsUid + "' " +
                "ORDER BY ORDERS";

        ResultSet resultSet = statement.executeQuery(query);

        ArrayList<HashMap> answer = new ArrayList<>();
        HashMap<String, Object> example_list = null;
        while (resultSet.next()) {
            // Hashmap에 먼저 담기
            example_list = new HashMap<String, Object>();
            example_list.put("ORDERS", resultSet.getInt("ORDERS"));
            example_list.put("EXAMPLE", resultSet.getString("EXAMPLE"));
            example_list.put("EXAMPLE_UID", resultSet.getString("EXAMPLE_UID"));

            System.out.println(example_list.get("EXAMPLE"));
            // ArrayList에 다시 담기
            answer.add(example_list);
        }

        return answer;
    }

    // DB에서 QUESTIONS_UID만 가져와 ArrayList에 담기
    public ArrayList<String> getQuestionUIDs() throws SQLException {
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        String query = "SELECT QUESTIONS_UID FROM QUESTIONS_LIST";

        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<String> questionUIDs = new ArrayList<>();

        while (resultSet.next()) {
            questionUIDs.add(resultSet.getString("QUESTIONS_UID"));
        }

        for (int i = 0; i < questionUIDs.size(); i++) {
            System.out.println(questionUIDs.get(i));
        }

        return questionUIDs;

    }
}