package com.example.layoutboard.Util;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaginationUtil {
    //페이지처리 메소드
    public static Map<String, Integer> Pagenation(Page<?> page) {
        Map<String, Integer> pageInfo = new HashMap<>();

        //변수명 사용자 마음대로, put 고정
        int currentPage = page.getNumber()+1;
        int totalPage = page.getTotalPages();
        int blockLimit = 5;

        //필요한 페이지 정보를 만들기 (java.Math - 수학라이브러리)
        int startPage = Math.max(1, currentPage-blockLimit/2);
        int endPage = Math.min(startPage+blockLimit-1, totalPage);
        int prevPage = Math.max(1, currentPage-1); //currentPage-10
        int nextPage = Math.min(totalPage, currentPage+1); //2->3, currentPage+10 2->12
        int lastPage = totalPage;

        pageInfo.put("startPage", startPage);
        pageInfo.put("endPage", endPage);
        pageInfo.put("prevPage", prevPage);
        pageInfo.put("nextPage", nextPage);
        pageInfo.put("lastPage", lastPage);

        return pageInfo;
    }
}
