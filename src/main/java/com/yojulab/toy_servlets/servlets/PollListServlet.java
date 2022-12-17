package com.yojulab.toy_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.yojulab.toy_servlets.DataInfor;
import com.yojulab.toy_servlets.beans.ServeyBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pollListServlet")
public class PollListServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {

                DataInfor dataInfor = new DataInfor();
                HashMap<String, Object> bundlesData = dataInfor.getBundlesData();

                response.setContentType("text/html;charset=UTF-8");
                PrintWriter printWriter = response.getWriter();

                printWriter.println("        <!DOCTYPE html>");
                printWriter.println("        <html lang='en'>");
                printWriter.println("  <head>");
                printWriter.println("    <meta charset='UTF-8' />");
                printWriter.println("    <title>설문</title>");
                printWriter.println("    <link rel='stylesheet' href='./css/commons.css' />");
                printWriter.println("    <link");
                printWriter.println(
                                "      href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css'");
                printWriter.println("      rel='stylesheet'");
                printWriter
                                .println("      integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65'");
                printWriter.println("      crossorigin='anonymous'");
                printWriter.println("    />");
                printWriter.println("  </head>");

                printWriter.println("  <body>");
                printWriter.println("    <div class='container'>");
                printWriter.println("      <div class='fs-3'>설문</div>");
                ArrayList<ServeyBean> nameListWithServeyBean = (ArrayList<ServeyBean>) bundlesData
                                .get("nameListWithServeyBean");
                ServeyBean serveyBean1 = nameListWithServeyBean.get(0);
                printWriter.println("<div>  이름 : " + serveyBean1.getName() + " </div>");
                printWriter.println("<div>  소속 : " + serveyBean1.getTeam() + " </div>");

                ArrayList<ServeyBean> dataListWithServeyBean = (ArrayList<ServeyBean>) bundlesData
                                .get("dataListWithServeyBean");

                for (int i = 0; i < dataListWithServeyBean.size(); i++) {
                        ServeyBean serveyBean = dataListWithServeyBean.get(i);
                        if (i == 0) {
                                printWriter.println("<div class='mt-3'> " + (i + 1) + ". " + serveyBean.getQuestion()
                                                + "</div>");
                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion1'");
                                printWriter.println("  id='answer11'");
                                printWriter.println("/>");
                                printWriter.println(" <label for='answer11'>" + serveyBean.getAnswer01() + "</label>");
                                printWriter.println("</div>");
                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion1'");
                                printWriter.println("  id='answer12'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer12'>" + serveyBean.getAnswer02() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion1'");
                                printWriter.println("  id='answer13'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer13'>" + serveyBean.getAnswer03() + "</label>");
                                printWriter.println("</div>");
                        } else if (i == 1) {
                                printWriter.println("<div> " + (i + 1) + ". " + serveyBean.getQuestion() + "</div>");
                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion2'");
                                printWriter.println("  id='answer21'");
                                printWriter.println("/>");
                                printWriter.println(" <label for='answer21'>" + serveyBean.getAnswer01() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion2'");
                                printWriter.println("  id='answer22'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer22'>" + serveyBean.getAnswer02() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion2'");
                                printWriter.println("  id='answer23'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer23'>" + serveyBean.getAnswer03() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion2'");
                                printWriter.println("  id='answer24'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer24'>" + serveyBean.getAnswer04() + "</label>");
                                printWriter.println("</div>");
                        } else if (i == 2) {
                                printWriter.println("<div> " + (i + 1) + ". " + serveyBean.getQuestion() + "</div>");
                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion3'");
                                printWriter.println("  id='answer31'");
                                printWriter.println("/>");
                                printWriter.println(" <label for='answer31'>" + serveyBean.getAnswer01() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion3'");
                                printWriter.println("  id='answer32'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer32'>" + serveyBean.getAnswer02() + "</label>");
                                printWriter.println("</div>");
                        } else if (i == 3) {
                                printWriter.println("<div> " + (i + 1) + ". " + serveyBean.getQuestion() + "</div>");
                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion4'");
                                printWriter.println("  id='answer41'");
                                printWriter.println("/>");
                                printWriter.println(" <label for='answer41'>" + serveyBean.getAnswer01() + "</label>");
                                printWriter.println("</div>");
                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion4'");
                                printWriter.println("  id='answer42'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer42'>" + serveyBean.getAnswer02() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion4'");
                                printWriter.println("  id='answer43'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer43'>" + serveyBean.getAnswer03() + "</label>");
                                printWriter.println("</div>");
                        } else if (i == 4) {
                                printWriter.println("<div> " + (i + 1) + ". " + serveyBean.getQuestion() + "</div>");
                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion5'");
                                printWriter.println("  id='answer51'");
                                printWriter.println("/>");
                                printWriter.println(" <label for='answer51'>" + serveyBean.getAnswer01() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion5'");
                                printWriter.println("  id='answer52'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer52'>" + serveyBean.getAnswer02() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion5'");
                                printWriter.println("  id='answer53'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer53'>" + serveyBean.getAnswer03() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion5'");
                                printWriter.println("  id='answer54'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer54'>" + serveyBean.getAnswer04() + "</label>");
                                printWriter.println("</div>");

                                printWriter.println("<div class='form-check form-check-inline'>");
                                printWriter.println("<input");
                                printWriter.println("  type='radio'");
                                printWriter.println("  class='form-check-input'");
                                printWriter.println("  name='quetion5'");
                                printWriter.println("  id='answer55'");
                                printWriter.println("/>");
                                printWriter.println("<label for='answer55'>" + serveyBean.getAnswer05() + "</label>");
                                printWriter.println("</div>");
                        } else {
                                break;
                        }
                }

                printWriter.println("    </div>");
                printWriter.println("    <script");
                printWriter.println(
                                "      src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
                printWriter
                                .println("      integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
                printWriter.println("     crossorigin='anonymous'");
                printWriter.println("    ></script>");
                printWriter.println("  </body>");
                printWriter.println("</html>");

                printWriter.close();

        }

}
