package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Dto<T> {
    private Response response; // 변수명 꼭 동일하게

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                private List<T> item;
            }
        }
    }

    @AllArgsConstructor
    @Data
    class ItemResponse {
        private String airlineNm;
        private String arrAirportNm;
        private String arrPlandTime;
        private String depAirportNm;
        private String depPlandTime;
        private int economyCharge;
        private int prestigeCharge;
        private String vihicleId;
    }

    @AllArgsConstructor
    @Data
    class ItemAirport {
        private String airportId;
        private String airportNm;
    }
}