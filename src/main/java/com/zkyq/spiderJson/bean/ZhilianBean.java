package com.zkyq.spiderJson.bean;

import java.util.List;

public class ZhilianBean {

    /**
     * code : 200
     */

    private int code;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * numFound : 606
         * debugInfo : []
         * loginfo : []
         * facets : []
         * extend :
         * method :
         * taskId : 94987326-4215-4f4c-8e92-c4a704aeeecd
         * scores : null
         */

        private int numFound;
        private String extend;
        private String method;
        private String taskId;
        private Object scores;
        private List<ResultsBean> results;
        private List<?> debugInfo;
        private List<?> loginfo;
        private List<?> facets;

        public int getNumFound() {
            return numFound;
        }

        public void setNumFound(int numFound) {
            this.numFound = numFound;
        }

        public String getExtend() {
            return extend;
        }

        public void setExtend(String extend) {
            this.extend = extend;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getTaskId() {
            return taskId;
        }

        public void setTaskId(String taskId) {
            this.taskId = taskId;
        }

        public Object getScores() {
            return scores;
        }

        public void setScores(Object scores) {
            this.scores = scores;
        }

        public List<ResultsBean> getResults() {
            return results;
        }

        public void setResults(List<ResultsBean> results) {
            this.results = results;
        }

        public List<?> getDebugInfo() {
            return debugInfo;
        }

        public void setDebugInfo(List<?> debugInfo) {
            this.debugInfo = debugInfo;
        }

        public List<?> getLoginfo() {
            return loginfo;
        }

        public void setLoginfo(List<?> loginfo) {
            this.loginfo = loginfo;
        }

        public List<?> getFacets() {
            return facets;
        }

        public void setFacets(List<?> facets) {
            this.facets = facets;
        }

        public static class ResultsBean {
            /**
             * number : CZ579073180J00095404112
             * jobType : {"items":[{"code":"160000","name":"软件/互联网开发/系统集成"},{"code":"2040","name":"Java开发工程师"}],"display":"软件/互联网开发/系统集成,Java开发工程师"}
             * company : {"number":"CZ579073180","url":"https://company.zhaopin.com/CZ579073180.htm","name":"河北臻龙科技有限公司","size":{"code":"3","name":"100-499人"},"type":{"code":"5","name":"民营"}}
             * positionURL : https://jobs.zhaopin.com/CZ579073180J00095404112.htm
             * workingExp : {"code":"-1","name":"不限"}
             * eduLevel : {"code":"5","name":"大专"}
             * salary : 4K-6K
             * emplType : 全职
             * jobName : java开发实习生+包住F
             * industry : 160400,210500,160600,160000
             * recruitCount : 0
             * geo : {"lat":"38.070431","lon":"114.573160"}
             * city : {"items":[{"code":"565","name":"石家庄"}],"display":"石家庄"}
             * applyType : 1
             * updateDate : 2018-12-04 14:42:10
             * createDate : 2018-11-20 17:14:43
             * endDate : 2018-12-20 17:14:43
             * welfare : ["五险一金","周末双休","带薪年假","弹性工作","每年多次调薪"]
             * saleType : 0
             * feedbackRation : 0.7619
             * score : 684.59973
             * resumeCount : 21
             * showLicence : 0
             * interview : 0
             * companyLogo :
             * tags : []
             * vipLevel : 1003
             * expandCount : 0
             * tagIntHighend : 0
             * positionLabel : {"qualifications":null,"role":null,"level":null,"jobLight":["五险一金","周末双休","带薪年假","弹性工作","每年多次调薪","定期体检","员工旅游","包住"],"companyTag":null,"skill":null,"refreshLevel":3,"chatWindow":20}
             * duplicated : false
             * futureJob : false
             * selected : false
             * applied : false
             * collected : false
             * isShow : false
             * timeState : 最新
             * rate : 76%
             */

            private String number;
            private JobTypeBean jobType;
            private CompanyBean company;
            private String positionURL;
            private WorkingExpBean workingExp;
            private EduLevelBean eduLevel;
            private String salary;
            private String emplType;
            private String jobName;
            private String industry;
            private int recruitCount;
            private GeoBean geo;
            private CityBean city;
            private String applyType;
            private String updateDate;
            private String createDate;
            private String endDate;
            private int saleType;
            private double feedbackRation;
            private double score;
            private int resumeCount;
            private int showLicence;
            private int interview;
            private String companyLogo;
            private int vipLevel;
            private int expandCount;
            private int tagIntHighend;
            private String positionLabel;
            private boolean duplicated;
            private boolean futureJob;
            private boolean selected;
            private boolean applied;
            private boolean collected;
            private boolean isShow;
            private String timeState;
            private String rate;
            private List<String> welfare;
            private List<?> tags;

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public JobTypeBean getJobType() {
                return jobType;
            }

            public void setJobType(JobTypeBean jobType) {
                this.jobType = jobType;
            }

            public CompanyBean getCompany() {
                return company;
            }

            public void setCompany(CompanyBean company) {
                this.company = company;
            }

            public String getPositionURL() {
                return positionURL;
            }

            public void setPositionURL(String positionURL) {
                this.positionURL = positionURL;
            }

            public WorkingExpBean getWorkingExp() {
                return workingExp;
            }

            public void setWorkingExp(WorkingExpBean workingExp) {
                this.workingExp = workingExp;
            }

            public EduLevelBean getEduLevel() {
                return eduLevel;
            }

            public void setEduLevel(EduLevelBean eduLevel) {
                this.eduLevel = eduLevel;
            }

            public String getSalary() {
                return salary;
            }

            public void setSalary(String salary) {
                this.salary = salary;
            }

            public String getEmplType() {
                return emplType;
            }

            public void setEmplType(String emplType) {
                this.emplType = emplType;
            }

            public String getJobName() {
                return jobName;
            }

            public void setJobName(String jobName) {
                this.jobName = jobName;
            }

            public String getIndustry() {
                return industry;
            }

            public void setIndustry(String industry) {
                this.industry = industry;
            }

            public int getRecruitCount() {
                return recruitCount;
            }

            public void setRecruitCount(int recruitCount) {
                this.recruitCount = recruitCount;
            }

            public GeoBean getGeo() {
                return geo;
            }

            public void setGeo(GeoBean geo) {
                this.geo = geo;
            }

            public CityBean getCity() {
                return city;
            }

            public void setCity(CityBean city) {
                this.city = city;
            }

            public String getApplyType() {
                return applyType;
            }

            public void setApplyType(String applyType) {
                this.applyType = applyType;
            }

            public String getUpdateDate() {
                return updateDate;
            }

            public void setUpdateDate(String updateDate) {
                this.updateDate = updateDate;
            }

            public String getCreateDate() {
                return createDate;
            }

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }

            public String getEndDate() {
                return endDate;
            }

            public void setEndDate(String endDate) {
                this.endDate = endDate;
            }

            public int getSaleType() {
                return saleType;
            }

            public void setSaleType(int saleType) {
                this.saleType = saleType;
            }

            public double getFeedbackRation() {
                return feedbackRation;
            }

            public void setFeedbackRation(double feedbackRation) {
                this.feedbackRation = feedbackRation;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public int getResumeCount() {
                return resumeCount;
            }

            public void setResumeCount(int resumeCount) {
                this.resumeCount = resumeCount;
            }

            public int getShowLicence() {
                return showLicence;
            }

            public void setShowLicence(int showLicence) {
                this.showLicence = showLicence;
            }

            public int getInterview() {
                return interview;
            }

            public void setInterview(int interview) {
                this.interview = interview;
            }

            public String getCompanyLogo() {
                return companyLogo;
            }

            public void setCompanyLogo(String companyLogo) {
                this.companyLogo = companyLogo;
            }

            public int getVipLevel() {
                return vipLevel;
            }

            public void setVipLevel(int vipLevel) {
                this.vipLevel = vipLevel;
            }

            public int getExpandCount() {
                return expandCount;
            }

            public void setExpandCount(int expandCount) {
                this.expandCount = expandCount;
            }

            public int getTagIntHighend() {
                return tagIntHighend;
            }

            public void setTagIntHighend(int tagIntHighend) {
                this.tagIntHighend = tagIntHighend;
            }

            public String getPositionLabel() {
                return positionLabel;
            }

            public void setPositionLabel(String positionLabel) {
                this.positionLabel = positionLabel;
            }

            public boolean isDuplicated() {
                return duplicated;
            }

            public void setDuplicated(boolean duplicated) {
                this.duplicated = duplicated;
            }

            public boolean isFutureJob() {
                return futureJob;
            }

            public void setFutureJob(boolean futureJob) {
                this.futureJob = futureJob;
            }

            public boolean isSelected() {
                return selected;
            }

            public void setSelected(boolean selected) {
                this.selected = selected;
            }

            public boolean isApplied() {
                return applied;
            }

            public void setApplied(boolean applied) {
                this.applied = applied;
            }

            public boolean isCollected() {
                return collected;
            }

            public void setCollected(boolean collected) {
                this.collected = collected;
            }

            public boolean isIsShow() {
                return isShow;
            }

            public void setIsShow(boolean isShow) {
                this.isShow = isShow;
            }

            public String getTimeState() {
                return timeState;
            }

            public void setTimeState(String timeState) {
                this.timeState = timeState;
            }

            public String getRate() {
                return rate;
            }

            public void setRate(String rate) {
                this.rate = rate;
            }

            public List<String> getWelfare() {
                return welfare;
            }

            public void setWelfare(List<String> welfare) {
                this.welfare = welfare;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }

            public static class JobTypeBean {
                /**
                 * items : [{"code":"160000","name":"软件/互联网开发/系统集成"},{"code":"2040","name":"Java开发工程师"}]
                 * display : 软件/互联网开发/系统集成,Java开发工程师
                 */

                private String display;
                private List<ItemsBean> items;

                public String getDisplay() {
                    return display;
                }

                public void setDisplay(String display) {
                    this.display = display;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class ItemsBean {
                    /**
                     * code : 160000
                     * name : 软件/互联网开发/系统集成
                     */

                    private String code;
                    private String name;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }

            public static class CompanyBean {
                /**
                 * number : CZ579073180
                 * url : https://company.zhaopin.com/CZ579073180.htm
                 * name : 河北臻龙科技有限公司
                 * size : {"code":"3","name":"100-499人"}
                 * type : {"code":"5","name":"民营"}
                 */

                private String number;
                private String url;
                private String name;
                private SizeBean size;
                private TypeBean type;

                public String getNumber() {
                    return number;
                }

                public void setNumber(String number) {
                    this.number = number;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public SizeBean getSize() {
                    return size;
                }

                public void setSize(SizeBean size) {
                    this.size = size;
                }

                public TypeBean getType() {
                    return type;
                }

                public void setType(TypeBean type) {
                    this.type = type;
                }

                public static class SizeBean {
                    /**
                     * code : 3
                     * name : 100-499人
                     */

                    private String code;
                    private String name;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }

                public static class TypeBean {
                    /**
                     * code : 5
                     * name : 民营
                     */

                    private String code;
                    private String name;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }

            public static class WorkingExpBean {
                /**
                 * code : -1
                 * name : 不限
                 */

                private String code;
                private String name;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class EduLevelBean {
                /**
                 * code : 5
                 * name : 大专
                 */

                private String code;
                private String name;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class GeoBean {
                /**
                 * lat : 38.070431
                 * lon : 114.573160
                 */

                private String lat;
                private String lon;

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }
            }

            public static class CityBean {
                /**
                 * items : [{"code":"565","name":"石家庄"}]
                 * display : 石家庄
                 */

                private String display;
                private List<ItemsBeanX> items;

                public String getDisplay() {
                    return display;
                }

                public void setDisplay(String display) {
                    this.display = display;
                }

                public List<ItemsBeanX> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBeanX> items) {
                    this.items = items;
                }

                public static class ItemsBeanX {
                    /**
                     * code : 565
                     * name : 石家庄
                     */

                    private String code;
                    private String name;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }
    }
}
