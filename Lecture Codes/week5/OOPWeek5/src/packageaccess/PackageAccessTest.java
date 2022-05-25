package packageaccess;

import packageaccess.higher.PackageData;

public class PackageAccessTest {
    public static void main(String[] args) {
        PackageData pd = new PackageData();

        pd.number = 5;  // 접근 불가
    }
}
