<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="./css/commons.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
  </head>

  <body>
    <% 
    ArrayList<HashMap> bundle_list = (ArrayList<HashMap>)request.getAttribute("bundle_list");
   %>
    <div class="container">
      <div class="fs-3">설문</div>
    <form action="" method="get">
        <% for (int i = 0; i < bundle_list.size(); i++) { %>
              <button id = "prev" class ="btn btn-primary">prev</button>
              <button id = "next" class ="btn btn-primary">next</button>
            <% HashMap<String, Object> bundle = bundle_list.get(i); %>
            <% HashMap<String, Object> question = (HashMap<String, Object>) bundle.get("question"); %>
      <% int orders = (int) question.get("ORDERS"); %>
      <% String questions = (String) question.get("QUESTIONS"); %>
        <div> <%= orders %>. <%=questions %> </div>

        <%  ArrayList<HashMap> example = (ArrayList<HashMap>) bundle.get("example_list"); %>
        <% for (int j = 0; j < example.size(); j++) { %>
        <% HashMap examples = example.get(j); %>
        <% int order = (int) examples.get("ORDERS"); %>
        <% String answers = (String) examples.get("EXAMPLE"); %>
        <% String questions_uid = (String) question.get("QUESTIONS_UID"); %>
        <% String example_uid = (String) examples.get("EXAMPLE_UID"); %>
        <div class= "form-check">
        <input type="radio" class= "form-check-input"name="<%=questions_uid %>" id="" value="<%=example_uid %>" />
        <label for="">(<%= order %>)<%= answers %></label>
        
        </div>
        <% } %>

        <% } %>

        </form>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
