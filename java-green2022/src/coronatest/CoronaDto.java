package coronatest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CoronaDto {
    private Response response;

    @Data
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

        @Data
        @AllArgsConstructor
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @Data
        @AllArgsConstructor
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @Data
            @AllArgsConstructor
            public class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor
                class Item {
                    private long accExamCnt; // 누적 의심신고 검사자
                    private String createDt; // 등록일시분초
                    private long deathCnt; // 사망자 수
                    private long decideCnt; // 확진자 수
                    private int seq; // 게시글번호
                    private String stateDt; // 기준일
                    private String stateTime; // 기준시간
                    private String updateDt; // 수정일시분초
                }
            }
        }
    }
}