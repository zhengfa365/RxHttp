package per.goweii.android.rxhttp.bean;

import per.goweii.rxhttp.request.base.BaseBean;

public class Sentenses extends BaseBean {
   private String name;
   private String from;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getFrom() {
      return from;
   }

   public void setFrom(String from) {
      this.from = from;
   }
}
