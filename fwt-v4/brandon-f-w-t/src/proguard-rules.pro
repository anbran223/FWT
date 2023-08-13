# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.brandonfwt.BrandonFWT {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/brandonfwt/repack'
-flattenpackagehierarchy
-dontpreverify

-dontwarn java.lang.invoke.StringConcatFactory