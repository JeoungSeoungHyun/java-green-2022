package data00;

import lombok.AllArgsConstructor;
import lombok.Data;

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