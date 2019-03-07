package com.my.bizuser.controller;

import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@RestController
@Path("/test")
public class TestController {

    @GET
    @Path("/sell")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSeller() {
        Seller seller = new Seller();
        seller.setName("粥品香坊（回龙观）");
        seller.setDescription("蜂鸟专送");
        seller.setDeliveryTime(38);
        seller.setScore(4.2);
        seller.setServiceScore(4.1);
        seller.setFoodScore(4.3);
        seller.setRankRate(69.2);
        seller.setMinPrice(20.0);
        seller.setDeliveryPrice(4.0);
        seller.setRatingCount(24);
        seller.setSellCount(90);
        seller.setBulletin("粥品香坊其烹饪粥料的秘方源于中国千年古法，在融和现代制作工艺，由世界烹饪大师屈浩先生领衔研发。坚守纯天然、0添加的良心品质深得消费者青睐，发展至今成为粥类的引领品牌。是2008年奥运会和2013年园博会指定餐饮服务商。");
        Support s1 = new Support(0, "在线支付满28减5");
        Support s2 = new Support(1, "VC无限橙果汁全场8折");
        Support s3 = new Support(2, "单人精彩套餐");
        Support s4 = new Support(3, "该商家支持发票,请下单写好发票抬头");
        Support s5 = new Support(4, "已加入“外卖保”计划,食品安全保障");
        List<Support> supports = new ArrayList<>();
        supports.add(s1);
        supports.add(s2);
        supports.add(s3);
        supports.add(s4);
        supports.add(s5);
        seller.setSupports(supports);
        seller.setAvatar("http://static.galileo.xiaojukeji.com/static/tms/seller_avatar_256px.jpg");
        List<String> pics = new ArrayList<>();
        pics.add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
        pics.add("http://fuss10.elemecdn.com/b/6c/75bd250e5ba69868f3b1178afbda3jpeg.jpeg?imageView2/1/w/180/h/180");
        pics.add("http://fuss10.elemecdn.com/f/96/3d608c5811bc2d902fc9ab9a5baa7jpeg.jpeg?imageView2/1/w/180/h/180");
        pics.add("http://fuss10.elemecdn.com/6/ad/779f8620ff49f701cd4c58f6448b6jpeg.jpeg?imageView2/1/w/180/h/180");
        seller.setPics(pics);
        List<String> infos = new ArrayList<>();
        infos.add("该商家支持发票,请下单写好发票抬头");
        infos.add("品类:其他菜系,包子粥店");
        infos.add("北京市昌平区回龙观西大街龙观置业大厦底商B座102单元1340");
        infos.add("营业时间:10:00-20:30");
        seller.setInfos(infos);

        return JSON.toJSONString(seller);
    }

    @GET
    @Path("/goods")
    @Produces(MediaType.APPLICATION_JSON)
    public String getGoods() {
        return "456";
    }

    @GET
    @Path("/rating")
    @Produces(MediaType.APPLICATION_JSON)
    public String getRating() {
        return "789";
    }

    class Seller {
        private String name;
        private String description;
        private Integer deliveryTime;
        private Double score;
        private Double serviceScore;
        private Double foodScore;
        private Double rankRate;
        private Double minPrice;
        private Double deliveryPrice;
        private Integer ratingCount;
        private Integer sellCount;
        private String bulletin;
        private List<Support> supports;
        private String avatar;
        private List<String> pics;
        private List<String> infos;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getDeliveryTime() {
            return deliveryTime;
        }

        public void setDeliveryTime(Integer deliveryTime) {
            this.deliveryTime = deliveryTime;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }

        public Double getServiceScore() {
            return serviceScore;
        }

        public void setServiceScore(Double serviceScore) {
            this.serviceScore = serviceScore;
        }

        public Double getFoodScore() {
            return foodScore;
        }

        public void setFoodScore(Double foodScore) {
            this.foodScore = foodScore;
        }

        public Double getRankRate() {
            return rankRate;
        }

        public void setRankRate(Double rankRate) {
            this.rankRate = rankRate;
        }

        public Double getMinPrice() {
            return minPrice;
        }

        public void setMinPrice(Double minPrice) {
            this.minPrice = minPrice;
        }

        public Double getDeliveryPrice() {
            return deliveryPrice;
        }

        public void setDeliveryPrice(Double deliveryPrice) {
            this.deliveryPrice = deliveryPrice;
        }

        public Integer getRatingCount() {
            return ratingCount;
        }

        public void setRatingCount(Integer ratingCount) {
            this.ratingCount = ratingCount;
        }

        public Integer getSellCount() {
            return sellCount;
        }

        public void setSellCount(Integer sellCount) {
            this.sellCount = sellCount;
        }

        public String getBulletin() {
            return bulletin;
        }

        public void setBulletin(String bulletin) {
            this.bulletin = bulletin;
        }

        public List<Support> getSupports() {
            return supports;
        }

        public void setSupports(List<Support> supports) {
            this.supports = supports;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public List<String> getPics() {
            return pics;
        }

        public void setPics(List<String> pics) {
            this.pics = pics;
        }

        public List<String> getInfos() {
            return infos;
        }

        public void setInfos(List<String> infos) {
            this.infos = infos;
        }
    }

    class Support {
        private Integer type;
        private String description;

        public Support(Integer type, String description) {
            this.type = type;
            this.description = description;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}
