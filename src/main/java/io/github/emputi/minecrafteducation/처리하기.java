package io.github.emputi.minecrafteducation;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;

public class 처리하기 {
    public static void 반복하기(int 반복횟수, 설계도 설계한내용) {
        for(int i = 0; i < 반복횟수; i++)
        {
            설계한내용.만들기();
        }
    }

    public static void 블럭교체하기(Material 블럭의종류, double x좌표, double y좌표, double z좌표)
    {
        Location location = new Location(Bukkit.getWorld("world"), x좌표, y좌표, z좌표);
        try {
            //noinspection ConstantConditions
            Bukkit.getWorld("world").getBlockAt(location).setType(블럭의종류);
        }
        catch(NullPointerException e)
        {
            try {
                throw new Exception("오류! 입력하신 좌표에 있는 블럭은 존재하지 않아요.");
            }
            catch (Exception e2)
            {
                e2.printStackTrace();
            }
        }
    }
}
