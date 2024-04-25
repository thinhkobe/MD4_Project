package ra.md4_project.service.shoppingCartService;

import ra.md4_project.model.dto.response.ShopPingCartResponse;

import java.util.List;

public interface IShopPingCartService {
    List<ShopPingCartResponse>getAllShoppingCartByUserId(Long userId);
}
