package com.yojulab.toy_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.yojulab.toy_servlets.beans.ServeyBean;

public class DataInfor {

    public ArrayList<ServeyBean> getDataListWithServeyBean() {
        // ArrayList선언
        ArrayList<ServeyBean> serveyList = new ArrayList<>();

        ServeyBean serveyBean = new ServeyBean();

        // 질문과 답 담기
        serveyBean.setQuestion("해당 매장을 방문시 매장은 청결 하였습니까?");
        serveyBean.setAnswer01("(1) 전혀 아니다");
        serveyBean.setAnswer02("(2) 아니다");
        serveyBean.setAnswer03("(3) 보통이다");
        serveyList.add(serveyBean);

        ServeyBean serveyBean02 = new ServeyBean();
        serveyBean02.setQuestion("주문시 직원은 고객님께 친절 하였습니까?");
        serveyBean02.setAnswer01("(1) 전혀 아니다");
        serveyBean02.setAnswer02("(2) 아니다");
        serveyBean02.setAnswer03("(3) 보통이다");
        serveyBean02.setAnswer04("(4) 그렇다");
        serveyList.add(serveyBean02);

        ServeyBean serveyBean03 = new ServeyBean();
        serveyBean03.setQuestion("주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        serveyBean03.setAnswer01("(1) 전혀 아니다");
        serveyBean03.setAnswer02("(2) 아니다");
        serveyList.add(serveyBean03);

        ServeyBean serveyBean04 = new ServeyBean();
        serveyBean04.setQuestion("해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        serveyBean04.setAnswer01("(1) 전혀 아니다");
        serveyBean04.setAnswer02("(2) 아니다");
        serveyBean04.setAnswer03("(3) 보통이다");
        serveyList.add(serveyBean04);

        ServeyBean serveyBean05 = new ServeyBean();
        serveyBean05.setQuestion("직원이 제조한 음료에 대해 맛은 좋았습니까?");
        serveyBean05.setAnswer01("(1) 전혀 아니다");
        serveyBean05.setAnswer02("(2) 아니다");
        serveyBean05.setAnswer03("(3) 보통이다");
        serveyBean05.setAnswer04("(4) 그렇다");
        serveyBean05.setAnswer05("(5) 매우 그렇다");
        serveyList.add(serveyBean05);

        return serveyList;

    }

    // 이름 소속 가져오기
    public ArrayList<ServeyBean> getNameTeamList() {
        ArrayList<ServeyBean> serveyName = new ArrayList<>();
        ServeyBean serveyBean = new ServeyBean();

        serveyBean.setName("진보경");
        serveyBean.setTeam("KH");
        serveyName.add(serveyBean);

        return serveyName;

    }

    // bundle
    public HashMap<String, Object> getBundlesData() {

        HashMap<String, Object> bundlesData = new HashMap<>();

        bundlesData.put("dataListWithServeyBean", getDataListWithServeyBean());
        bundlesData.put("nameListWithServeyBean", getNameTeamList());
        return bundlesData;

    }
}
