package guru.springframwork.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long ups;
    private BigDecimal price;
    private Integer quantityOnHand;

    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
