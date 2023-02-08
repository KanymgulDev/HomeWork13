public class Keyboard {
     private boolean illumination;
     private boolean additionalKeys;
     private String trueOrFalse;
     private String illuminationTrueOrFalse;
     private  boolean b = true;



     public boolean isIllumination() {
          return illumination;
     }

     public void setIllumination(boolean illumination) {
          if (illumination == b) {
               illuminationTrueOrFalse = "Yes";
          } else {
               illuminationTrueOrFalse = "No";
          }
     }

     public boolean isAdditionalKeys() {
          return additionalKeys;
     }

     public void setAdditionalKeys(boolean additionalKeys) {
          if (additionalKeys == b) {
               trueOrFalse = "Yes";
          } else {
               trueOrFalse = "No";
          }
     }

     public String getTrueOrFalse() {
          return trueOrFalse;
     }

     public String getIlluminationTrueOrFalse() {
          return illuminationTrueOrFalse;
     }

     public boolean isB() {
          return b;
     }

     public String getInfoKey() {
          return "\nIllumination: " + illuminationTrueOrFalse +
                  "\nAdditional keys: " + trueOrFalse;
     }
}
