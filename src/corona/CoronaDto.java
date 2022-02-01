package corona;

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
                    private long accExamCnt;
                    private String createDt;
                    private long deathCnt;
                    private long decideCnt;
                    private String seq;
                    private String stateDt;
                    private String stateTime;
                    private String updateDt;
                }
            }
        }
    }
}
