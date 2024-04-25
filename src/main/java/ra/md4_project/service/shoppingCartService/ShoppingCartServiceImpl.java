package ra.md4_project.service.shoppingCartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md4_project.model.dto.response.ShopPingCartResponse;
import ra.md4_project.model.entity.ShoppingCart;
import ra.md4_project.repository.IShoppingCartRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements IShopPingCartService{
    @Autowired
  private   IShoppingCartRepository iShoppingCartRepository;
    @Override
    public List<ShopPingCartResponse> getAllShoppingCartByUserId(Long userId) {
        List<ShoppingCart> cartList=iShoppingCartRepository.findAllByUserUserId(userId);
        List<ShopPingCartResponse> cartResponseList=new ArrayList<>();
        for (ShoppingCart shoppingCart : cartList) {
            ShopPingCartResponse cartResponse=new ShopPingCartResponse();
            cartResponse.setProductName(shoppingCart.getProduct().getProductName());
            cartResponse.setProductPrice(shoppingCart.getProduct().getUnitPrice());
            cartResponse.setQuantity(shoppingCart.getOrderQuantity());
            cartResponseList.add(cartResponse);
        }
        return cartResponseList;
    }
}
