<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>

  <% HashMap<String, Object> question = (HashMap<String, Object>)request.getAttribute("questions");%>
  <%  ArrayList<HashMap> answer = (ArrayList<HashMap>)request.getAttribute("example_list"); %>
    <div>
    <a href="/polls/PollServlet?QUESTIONS_UID=Q1">Q1</a>
    <a href="/polls/PollServlet?QUESTIONS_UID=Q2">Q2</a>
    <a href="/polls/PollServlet?QUESTIONS_UID=Q3">Q3</a>
    <a href="/polls/PollServlet?QUESTIONS_UID=Q4">Q4</a>
    <a href="/polls/PollServlet?QUESTIONS_UID=Q5">Q5</a>
    </div>
    <div>
     <%= question.get("ORDERS") %>. <%= question.get("QUESTIONS")%>
    </div>

    <%for (int i = 0; i < answer.size(); i++) { %>
            <% HashMap<String, Object> bundle = answer.get(i); %>
            <% String example = (String) bundle.get("EXAMPLE"); %>
            <% int order = (int) bundle.get("ORDERS") ;%>

        <div class="form-check"> 
          <input class="form-check-input" type="radio" name="<%= question.get("QUESTIONS_UID")%>" id="<%= question.get("QUESTIONS_UID")%><%= order %>" value = "<%=bundle.get("EXAMPLE_UID") %>" />
        <label for="<%= question.get("QUESTIONS_UID")%><%= order %>">(<%= order %>) <%=example%> </label>
         </div>

    <% } %>
    </body>
</html>
