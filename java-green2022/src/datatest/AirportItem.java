package datatest;

import datatest.AirportDto.Response.Body.Items;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AirportItem {
    private String airportId;
    private String airportNm;
}