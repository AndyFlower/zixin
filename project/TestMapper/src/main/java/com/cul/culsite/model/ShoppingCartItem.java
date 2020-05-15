package com.cul.culsite.model;

import com.cul.culsite.dto.MEsShoppingCartItemDTO;

import java.util.Date;

/**
 * Created by rd on 2015/3/25.
 */
public class ShoppingCartItem {
    private String cartId;
    private String cartItemId;
    private String productId;
    private String sn;
    private int quantity;
    private Date lastUpdate;
    private Date createTime;

    @Override
    public String toString() {
        return "ShoppingCartItem{" +
                "cartId='" + cartId + '\'' +
                ", cartItemId='" + cartItemId + '\'' +
                ", productId='" + productId + '\'' +
                ", sn='" + sn + '\'' +
                ", quantity=" + quantity +
                ", lastUpdate=" + lastUpdate +
                ", createTime=" + createTime +
                '}';
    }

    public static ShoppingCartItem fromDTO(MEsShoppingCartItemDTO dto) {
        if (dto == null) {
            return null;
        }
        ShoppingCartItem item = new ShoppingCartItem();
        item.cartItemId = dto.getShoppingCartItemId();
        item.cartId = dto.getShoppingCartId();
        item.productId = dto.getProductId();
        item.sn = dto.getProductSn();
        item.quantity = dto.getQuantity();
        item.lastUpdate = dto.getLastUpdateTime();
        item.createTime = dto.getCreateTime();
        return item;
    }

    public MEsShoppingCartItemDTO toDTO() {
        MEsShoppingCartItemDTO dto = new MEsShoppingCartItemDTO();
        dto.setShoppingCartId(cartId);
        dto.setShoppingCartItemId(cartItemId);
        dto.setProductId(productId);
        dto.setProductSn(sn);
        dto.setQuantity(quantity);
        dto.setLastUpdateTime(lastUpdate);
        dto.setCreateTime(createTime);
        return dto;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }
}
