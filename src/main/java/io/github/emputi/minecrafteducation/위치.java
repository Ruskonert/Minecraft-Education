package io.github.emputi.minecrafteducation;

import org.bukkit.Location;

public class 위치
{
    public double x좌표 = 0;
    public double y좌표 = 0;
    public double z좌표 = 0;
    public float 요 = 0;
    public float 피치 = 0;
    public 위치(Location location)
    {
        this.x좌표 = location.getX();
        this.y좌표 = location.getY();
        this.z좌표 = location.getZ();
        this.요 = location.getYaw();
        this.피치 = location.getPitch();
    }

}
