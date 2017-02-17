package bule.souv.com.mvp_rxjava_retrofittest_master.bean;

import java.util.List;

/**
 * 描述：天气实体类
 * 作者：dc on 2016/11/15 16:48
 * 邮箱：597210600@qq.com
 */
public class WeatherInfoBean {


    /**
     * realtime : {"wind":{"windspeed":null,"direct":"西北风","power":"1级","offset":null},"time":"16:00:00","weather":{"humidity":"93","img":"3","info":"阵雨","temperature":"16"},"dataUptime":"1479197752","date":"2016-11-15","city_code":"101250101","city_name":"长沙","week":"2","moon":"十月十六"}
     * life : {"date":"2016-11-15","info":{"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["最弱","属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"],"ganmao":["较易发","天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":null,"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"]}}
     * weather : [{"date":"2016-11-15","week":"二","nongli":"十月十六","info":{"dawn":null,"day":["7","小雨","18","西北风","微风","06:50"],"night":["7","小雨","16","西北风","微风","17:35"]}},{"date":"2016-11-16","week":"三","nongli":"十月十七","info":{"dawn":["7","小雨","16","西北风","微风","17:35"],"day":["3","阵雨","19","北风","微风","06:51"],"night":["3","阵雨","16","北风","微风","17:34"]}},{"date":"2016-11-17","week":"四","nongli":"十月十八","info":{"dawn":["3","阵雨","16","北风","微风","17:34"],"day":["7","小雨","19","北风","微风","06:51"],"night":["2","阴","16","北风","微风","17:34"]}},{"date":"2016-11-18","week":"五","nongli":"十月十九","info":{"dawn":["2","阴","16","北风","微风","17:34"],"day":["1","多云","22","北风","微风","06:52"],"night":["3","阵雨","16","北风","微风","17:34"]}},{"date":"2016-11-19","week":"六","nongli":"十月二十","info":{"dawn":["3","阵雨","16","北风","微风","17:34"],"day":["7","小雨","21","南风","微风","06:53"],"night":["7","小雨","17","南风","微风","17:33"]}}]
     * pm25 : {"key":"Changsha","show_desc":"0","pm25":{"curPm":"114","pm25":"85","pm10":"93","level":"3","quality":"轻度污染","des":"轻微污染 易感人群症状有轻度加剧，健康人群出现刺激症状 心脏病和呼吸系统疾病患者应减少体力消耗和户外活动。"},"dateTime":"2016年11月15日15时","cityName":"长沙"}
     * isForeign : 0
     */

    private ResultBean result;
    /**
     * result : {"realtime":{"wind":{"windspeed":null,"direct":"西北风","power":"1级","offset":null},"time":"16:00:00","weather":{"humidity":"93","img":"3","info":"阵雨","temperature":"16"},"dataUptime":"1479197752","date":"2016-11-15","city_code":"101250101","city_name":"长沙","week":"2","moon":"十月十六"},"life":{"date":"2016-11-15","info":{"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["最弱","属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"],"ganmao":["较易发","天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":null,"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"]}},"weather":[{"date":"2016-11-15","week":"二","nongli":"十月十六","info":{"dawn":null,"day":["7","小雨","18","西北风","微风","06:50"],"night":["7","小雨","16","西北风","微风","17:35"]}},{"date":"2016-11-16","week":"三","nongli":"十月十七","info":{"dawn":["7","小雨","16","西北风","微风","17:35"],"day":["3","阵雨","19","北风","微风","06:51"],"night":["3","阵雨","16","北风","微风","17:34"]}},{"date":"2016-11-17","week":"四","nongli":"十月十八","info":{"dawn":["3","阵雨","16","北风","微风","17:34"],"day":["7","小雨","19","北风","微风","06:51"],"night":["2","阴","16","北风","微风","17:34"]}},{"date":"2016-11-18","week":"五","nongli":"十月十九","info":{"dawn":["2","阴","16","北风","微风","17:34"],"day":["1","多云","22","北风","微风","06:52"],"night":["3","阵雨","16","北风","微风","17:34"]}},{"date":"2016-11-19","week":"六","nongli":"十月二十","info":{"dawn":["3","阵雨","16","北风","微风","17:34"],"day":["7","小雨","21","南风","微风","06:53"],"night":["7","小雨","17","南风","微风","17:33"]}}],"pm25":{"key":"Changsha","show_desc":"0","pm25":{"curPm":"114","pm25":"85","pm10":"93","level":"3","quality":"轻度污染","des":"轻微污染 易感人群症状有轻度加剧，健康人群出现刺激症状 心脏病和呼吸系统疾病患者应减少体力消耗和户外活动。"},"dateTime":"2016年11月15日15时","cityName":"长沙"},"isForeign":0}
     * error_code : 0
     * reason : Succes
     */

    private int error_code;
    private String reason;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public static class ResultBean {
        /**
         * wind : {"windspeed":null,"direct":"西北风","power":"1级","offset":null}
         * time : 16:00:00
         * weather : {"humidity":"93","img":"3","info":"阵雨","temperature":"16"}
         * dataUptime : 1479197752
         * date : 2016-11-15
         * city_code : 101250101
         * city_name : 长沙
         * week : 2
         * moon : 十月十六
         */

        private RealtimeBean realtime;
        /**
         * date : 2016-11-15
         * info : {"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["最弱","属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"],"ganmao":["较易发","天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":null,"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"]}
         */

        private LifeBean life;
        /**
         * key : Changsha
         * show_desc : 0
         * pm25 : {"curPm":"114","pm25":"85","pm10":"93","level":"3","quality":"轻度污染","des":"轻微污染 易感人群症状有轻度加剧，健康人群出现刺激症状 心脏病和呼吸系统疾病患者应减少体力消耗和户外活动。"}
         * dateTime : 2016年11月15日15时
         * cityName : 长沙
         */

        private Pm25Bean pm25;
        private int isForeign;
        /**
         * date : 2016-11-15
         * week : 二
         * nongli : 十月十六
         * info : {"dawn":null,"day":["7","小雨","18","西北风","微风","06:50"],"night":["7","小雨","16","西北风","微风","17:35"]}
         */


        public RealtimeBean getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeBean realtime) {
            this.realtime = realtime;
        }

        public LifeBean getLife() {
            return life;
        }

        public void setLife(LifeBean life) {
            this.life = life;
        }

        public Pm25Bean getPm25() {
            return pm25;
        }

        public void setPm25(Pm25Bean pm25) {
            this.pm25 = pm25;
        }

        public int getIsForeign() {
            return isForeign;
        }

        public void setIsForeign(int isForeign) {
            this.isForeign = isForeign;
        }



        public static class RealtimeBean {
            /**
             * windspeed : null
             * direct : 西北风
             * power : 1级
             * offset : null
             */

            private WindBean wind;
            private String time;
            /**
             * humidity : 93
             * img : 3
             * info : 阵雨
             * temperature : 16
             */

            private WeatherBean weather;
            private String dataUptime;
            private String date;
            private String city_code;
            private String city_name;
            private String week;
            private String moon;

            public WindBean getWind() {
                return wind;
            }

            public void setWind(WindBean wind) {
                this.wind = wind;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public WeatherBean getWeather() {
                return weather;
            }

            public void setWeather(WeatherBean weather) {
                this.weather = weather;
            }

            public String getDataUptime() {
                return dataUptime;
            }

            public void setDataUptime(String dataUptime) {
                this.dataUptime = dataUptime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCity_code() {
                return city_code;
            }

            public void setCity_code(String city_code) {
                this.city_code = city_code;
            }

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getMoon() {
                return moon;
            }

            public void setMoon(String moon) {
                this.moon = moon;
            }

            public static class WindBean {
                private Object windspeed;
                private String direct;
                private String power;
                private Object offset;

                public Object getWindspeed() {
                    return windspeed;
                }

                public void setWindspeed(Object windspeed) {
                    this.windspeed = windspeed;
                }

                public String getDirect() {
                    return direct;
                }

                public void setDirect(String direct) {
                    this.direct = direct;
                }

                public String getPower() {
                    return power;
                }

                public void setPower(String power) {
                    this.power = power;
                }

                public Object getOffset() {
                    return offset;
                }

                public void setOffset(Object offset) {
                    this.offset = offset;
                }
            }

            public static class WeatherBean {
                private String humidity;
                private String img;
                private String info;
                private String temperature;

                public String getHumidity() {
                    return humidity;
                }

                public void setHumidity(String humidity) {
                    this.humidity = humidity;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }
            }
        }

        public static class LifeBean {
            private String date;
            /**
             * kongtiao : ["较少开启","您将感到很舒适，一般不需要开启空调。"]
             * yundong : ["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"]
             * ziwaixian : ["最弱","属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"]
             * ganmao : ["较易发","天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"]
             * xiche : ["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"]
             * wuran : null
             * chuanyi : ["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"]
             */

            private InfoBean info;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public InfoBean getInfo() {
                return info;
            }

            public void setInfo(InfoBean info) {
                this.info = info;
            }

            public static class InfoBean {
                private Object wuran;
                private List<String> kongtiao;
                private List<String> yundong;
                private List<String> ziwaixian;
                private List<String> ganmao;
                private List<String> xiche;
                private List<String> chuanyi;

                public Object getWuran() {
                    return wuran;
                }

                public void setWuran(Object wuran) {
                    this.wuran = wuran;
                }

                public List<String> getKongtiao() {
                    return kongtiao;
                }

                public void setKongtiao(List<String> kongtiao) {
                    this.kongtiao = kongtiao;
                }

                public List<String> getYundong() {
                    return yundong;
                }

                public void setYundong(List<String> yundong) {
                    this.yundong = yundong;
                }

                public List<String> getZiwaixian() {
                    return ziwaixian;
                }

                public void setZiwaixian(List<String> ziwaixian) {
                    this.ziwaixian = ziwaixian;
                }

                public List<String> getGanmao() {
                    return ganmao;
                }

                public void setGanmao(List<String> ganmao) {
                    this.ganmao = ganmao;
                }

                public List<String> getXiche() {
                    return xiche;
                }

                public void setXiche(List<String> xiche) {
                    this.xiche = xiche;
                }

                public List<String> getChuanyi() {
                    return chuanyi;
                }

                public void setChuanyi(List<String> chuanyi) {
                    this.chuanyi = chuanyi;
                }
            }
        }

        public static class Pm25Bean {

            public static class WeatherBean {
                private String date;
                private String week;
                private String nongli;
                /**
                 * dawn : null
                 * day : ["7","小雨","18","西北风","微风","06:50"]
                 * night : ["7","小雨","16","西北风","微风","17:35"]
                 */

                private InfoBean info;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getNongli() {
                    return nongli;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public static class InfoBean {
                    private Object dawn;
                    private List<String> day;
                    private List<String> night;

                    public Object getDawn() {
                        return dawn;
                    }

                    public void setDawn(Object dawn) {
                        this.dawn = dawn;
                    }

                    public List<String> getDay() {
                        return day;
                    }

                    public void setDay(List<String> day) {
                        this.day = day;
                    }

                    public List<String> getNight() {
                        return night;
                    }

                    public void setNight(List<String> night) {
                        this.night = night;
                    }
                }
            }
        }}
}
