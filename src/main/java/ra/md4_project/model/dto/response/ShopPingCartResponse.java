package ra.md4_project.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShopPingCartResponse {
  private   String productName;
  private  int quantity;
  private BigDecimal productPrice;
}
