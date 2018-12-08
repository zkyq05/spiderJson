package com.zkyq.spiderJson.bean;

import java.util.List;

public class TGirlBean {

    /**
     * status : show
     */

    private String status;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * postFeeText : 运费
         * trace : msrp_auction
         * recommendAuctions : []
         * isSameStyleView : false
         * sellers : []
         * query : 女装
         * spmModId : 14
         */

        private String postFeeText;
        private String trace;
        private boolean isSameStyleView;
        private String query;
        private String spmModId;
        private List<AuctionsBean> auctions;
        private List<?> recommendAuctions;
        private List<?> sellers;

        public String getPostFeeText() {
            return postFeeText;
        }

        public void setPostFeeText(String postFeeText) {
            this.postFeeText = postFeeText;
        }

        public String getTrace() {
            return trace;
        }

        public void setTrace(String trace) {
            this.trace = trace;
        }

        public boolean isIsSameStyleView() {
            return isSameStyleView;
        }

        public void setIsSameStyleView(boolean isSameStyleView) {
            this.isSameStyleView = isSameStyleView;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getSpmModId() {
            return spmModId;
        }

        public void setSpmModId(String spmModId) {
            this.spmModId = spmModId;
        }

        public List<AuctionsBean> getAuctions() {
            return auctions;
        }

        public void setAuctions(List<AuctionsBean> auctions) {
            this.auctions = auctions;
        }

        public List<?> getRecommendAuctions() {
            return recommendAuctions;
        }

        public void setRecommendAuctions(List<?> recommendAuctions) {
            this.recommendAuctions = recommendAuctions;
        }

        public List<?> getSellers() {
            return sellers;
        }

        public void setSellers(List<?> sellers) {
            this.sellers = sellers;
        }

        public static class AuctionsBean {
            /**
             *
             */

            private int p4p;
            private boolean p4pSameHeight;
            private String nid;
            private String category;
            private String pid;
            private String title;
            private String raw_title;
            private String pic_url;
            private String detail_url;
            private String view_price;
            private String view_fee;
            private String item_loc;
            private String view_sales;
            private String comment_count;
            private String user_id;
            private String nick;
            private ShopcardBean shopcard;
            private boolean isHideIM;
            private boolean isHideNick;
            private String comment_url;
            private String shopLink;
            private I2iTagsBean i2iTags;
            private String risk;
            private List<IconBean> icon;
            private List<?> p4pTags;

            public int getP4p() {
                return p4p;
            }

            public void setP4p(int p4p) {
                this.p4p = p4p;
            }

            public boolean isP4pSameHeight() {
                return p4pSameHeight;
            }

            public void setP4pSameHeight(boolean p4pSameHeight) {
                this.p4pSameHeight = p4pSameHeight;
            }

            public String getNid() {
                return nid;
            }

            public void setNid(String nid) {
                this.nid = nid;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getRaw_title() {
                return raw_title;
            }

            public void setRaw_title(String raw_title) {
                this.raw_title = raw_title;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getDetail_url() {
                return detail_url;
            }

            public void setDetail_url(String detail_url) {
                this.detail_url = detail_url;
            }

            public String getView_price() {
                return view_price;
            }

            public void setView_price(String view_price) {
                this.view_price = view_price;
            }

            public String getView_fee() {
                return view_fee;
            }

            public void setView_fee(String view_fee) {
                this.view_fee = view_fee;
            }

            public String getItem_loc() {
                return item_loc;
            }

            public void setItem_loc(String item_loc) {
                this.item_loc = item_loc;
            }

            public String getView_sales() {
                return view_sales;
            }

            public void setView_sales(String view_sales) {
                this.view_sales = view_sales;
            }

            public String getComment_count() {
                return comment_count;
            }

            public void setComment_count(String comment_count) {
                this.comment_count = comment_count;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public ShopcardBean getShopcard() {
                return shopcard;
            }

            public void setShopcard(ShopcardBean shopcard) {
                this.shopcard = shopcard;
            }

            public boolean isIsHideIM() {
                return isHideIM;
            }

            public void setIsHideIM(boolean isHideIM) {
                this.isHideIM = isHideIM;
            }

            public boolean isIsHideNick() {
                return isHideNick;
            }

            public void setIsHideNick(boolean isHideNick) {
                this.isHideNick = isHideNick;
            }

            public String getComment_url() {
                return comment_url;
            }

            public void setComment_url(String comment_url) {
                this.comment_url = comment_url;
            }

            public String getShopLink() {
                return shopLink;
            }

            public void setShopLink(String shopLink) {
                this.shopLink = shopLink;
            }

            public I2iTagsBean getI2iTags() {
                return i2iTags;
            }

            public void setI2iTags(I2iTagsBean i2iTags) {
                this.i2iTags = i2iTags;
            }

            public String getRisk() {
                return risk;
            }

            public void setRisk(String risk) {
                this.risk = risk;
            }

            public List<IconBean> getIcon() {
                return icon;
            }

            public void setIcon(List<IconBean> icon) {
                this.icon = icon;
            }

            public List<?> getP4pTags() {
                return p4pTags;
            }

            public void setP4pTags(List<?> p4pTags) {
                this.p4pTags = p4pTags;
            }

            public static class ShopcardBean {
                /**
                 * levelClasses : []
                 * isTmall : true
                 * delivery : [0,1,1364]
                 * description : [0,1,665]
                 * service : [0,1,1895]
                 * encryptedUserId : UvFkuvGI0MmIGOQTT
                 */

                private boolean isTmall;
                private String encryptedUserId;
                private List<?> levelClasses;
                private List<Integer> delivery;
                private List<Integer> description;
                private List<Integer> service;

                public boolean isIsTmall() {
                    return isTmall;
                }

                public void setIsTmall(boolean isTmall) {
                    this.isTmall = isTmall;
                }

                public String getEncryptedUserId() {
                    return encryptedUserId;
                }

                public void setEncryptedUserId(String encryptedUserId) {
                    this.encryptedUserId = encryptedUserId;
                }

                public List<?> getLevelClasses() {
                    return levelClasses;
                }

                public void setLevelClasses(List<?> levelClasses) {
                    this.levelClasses = levelClasses;
                }

                public List<Integer> getDelivery() {
                    return delivery;
                }

                public void setDelivery(List<Integer> delivery) {
                    this.delivery = delivery;
                }

                public List<Integer> getDescription() {
                    return description;
                }

                public void setDescription(List<Integer> description) {
                    this.description = description;
                }

                public List<Integer> getService() {
                    return service;
                }

                public void setService(List<Integer> service) {
                    this.service = service;
                }
            }

            public static class I2iTagsBean {
                /**
                 * samestyle : {"url":"/search?type=samestyle&app=i2i&rec_type=1&uniqpid=-1491970139&nid=575869128379"}
                 * similar : {"url":"/search?type=similar&app=i2i&rec_type=1&uniqpid=-1491970139&nid=575869128379"}
                 */

                private SamestyleBean samestyle;
                private SimilarBean similar;

                public SamestyleBean getSamestyle() {
                    return samestyle;
                }

                public void setSamestyle(SamestyleBean samestyle) {
                    this.samestyle = samestyle;
                }

                public SimilarBean getSimilar() {
                    return similar;
                }

                public void setSimilar(SimilarBean similar) {
                    this.similar = similar;
                }

                public static class SamestyleBean {
                    /**
                     * url : /search?type=samestyle&app=i2i&rec_type=1&uniqpid=-1491970139&nid=575869128379
                     */

                    private String url;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }

                public static class SimilarBean {
                    /**
                     * url : /search?type=similar&app=i2i&rec_type=1&uniqpid=-1491970139&nid=575869128379
                     */

                    private String url;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }

            public static class IconBean {
                /**
                 * title : 购物津贴
                 * dom_class : icon-text-1111-stock
                 * position : 2
                 * show_type : 0
                 * icon_category : baobei
                 * outer_text : 0
                 * html : <span class="icon-text-1111-stock">每满300减30┊跨店</span>
                 * icon_key : icon-text-1111-stock
                 * trace : srpservice
                 * traceIdx : 0
                 * innerText : 双11购物津贴
                 * url : //re.taobao.com/search?keyword=%C5%AE%D7%B0&refpid=420432_1006&frcatid=&
                 */

                private String title;
                private String dom_class;
                private String position;
                private String show_type;
                private String icon_category;
                private String outer_text;
                private String html;
                private String icon_key;
                private String trace;
                private int traceIdx;
                private String innerText;
                private String url;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDom_class() {
                    return dom_class;
                }

                public void setDom_class(String dom_class) {
                    this.dom_class = dom_class;
                }

                public String getPosition() {
                    return position;
                }

                public void setPosition(String position) {
                    this.position = position;
                }

                public String getShow_type() {
                    return show_type;
                }

                public void setShow_type(String show_type) {
                    this.show_type = show_type;
                }

                public String getIcon_category() {
                    return icon_category;
                }

                public void setIcon_category(String icon_category) {
                    this.icon_category = icon_category;
                }

                public String getOuter_text() {
                    return outer_text;
                }

                public void setOuter_text(String outer_text) {
                    this.outer_text = outer_text;
                }

                public String getHtml() {
                    return html;
                }

                public void setHtml(String html) {
                    this.html = html;
                }

                public String getIcon_key() {
                    return icon_key;
                }

                public void setIcon_key(String icon_key) {
                    this.icon_key = icon_key;
                }

                public String getTrace() {
                    return trace;
                }

                public void setTrace(String trace) {
                    this.trace = trace;
                }

                public int getTraceIdx() {
                    return traceIdx;
                }

                public void setTraceIdx(int traceIdx) {
                    this.traceIdx = traceIdx;
                }

                public String getInnerText() {
                    return innerText;
                }

                public void setInnerText(String innerText) {
                    this.innerText = innerText;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
