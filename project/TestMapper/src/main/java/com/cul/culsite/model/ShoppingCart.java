package com.cul.culsite.model;

import com.cul.culsite.dto.MEsShoppingCartDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rd on 2015/3/25.
 */
public class ShoppingCart {
    private String cartId;
    private String userId;
    private String platform;
    private String status;
    private List<ShoppingCartItem> items;

    private String jv;// 明细中商品所属jv
    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId='" + cartId + '\'' +
                ", userId='" + userId + '\'' +
                ", platform='" + platform + '\'' +
                ", status='" + status + '\'' +
                ", jv='" + jv + '\'' +
                ", items=" + items +
                '}';
    }

    public static ShoppingCart fromDTO(MEsShoppingCartDTO dto) {
        if (dto == null) {
            return null;
        }
        ShoppingCart cart = new ShoppingCart();
        cart.cartId = dto.getShoppingCartId();
        cart.userId = dto.getUserId();
        cart.platform = dto.getPlatform();
        cart.status = dto.getStatus();
        return cart;
    }

    public MEsShoppingCartDTO toDTO() {
        MEsShoppingCartDTO dto = new MEsShoppingCartDTO();
        dto.setShoppingCartId(cartId);
        dto.setUserId(userId);
        dto.setPlatform(platform);
        dto.setStatus(status);
        return dto;
    }

    public ShoppingCart addItem(ShoppingCartItem item) {
        if (items == null) {
            items = new ArrayList<ShoppingCartItem>();
        }

        items.add(item);
        return this;
    }

    public ShoppingCart removeItem(ShoppingCartItem item) {
        if (items != null) {
            items.remove(item);
        }
        return this;
    }

    public ShoppingCart updateItem(ShoppingCartItem item) {
        if (items == null) {
            return addItem(item);
        }

        for (ShoppingCartItem cartItem : items) {
            if (cartItem.getProductId().equals(item.getProductId())) {
                cartItem.setQuantity(item.getQuantity());
                break;
            }
        }
        return this;
    }

    public String getJv() {
		return jv;
	}

	public void setJv(String jv) {
		this.jv = jv;
	}

	public List<ShoppingCartItem> getItems() {
        return items;
    }

    public void setItems(List<ShoppingCartItem> items) {
        this.items = items;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
