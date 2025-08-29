package com.my.board.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
//전체 페이지와 현재 페이지를 주면
//페이징 블럭을 전달 해주는 서비스
public class PaginationService {

    private static final int BAR_LENGTH =5;

    public List<Integer> getPaginationBarNumber(
            int currentPageNumber,
            int totalPageNumber
    ) {
        int startNumber =
                Math.max(currentPageNumber - (BAR_LENGTH / 2), 0);
        int endNumber =
                Math.min(startNumber + BAR_LENGTH, totalPageNumber);

        return IntStream.range(startNumber, endNumber)
                .boxed().toList();
    }

    public int currentBatLength() {
        return BAR_LENGTH;
    }

}
