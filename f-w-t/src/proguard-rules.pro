# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.fwt.FWT {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/fwt/repack'
-flattenpackagehierarchy
-dontpreverify
