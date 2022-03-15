import java.util.Scanner;
import java.lang.*;

public class Bathroom {
	private int flag_water; //���� ������ ����
    private Parametrs param_bath = new Parametrs();

    //�����������
    public Bathroom()
    {
        this.param_bath.Set_parametrs(0, 0, 0, 0, 0, 0);
        this.flag_water = 0;
    }

    //������� ��������� ������ �� �����
    public double Get_air_temp_bath()
    {
        return this.param_bath.Get_air_temp();
    }

    public double Get_air_hum_bath()
    {
        return this.param_bath.Get_air_hum();
    }

    public double Get_conc_co2_bath()
    {
        return this.param_bath.Get_conc_co2();
    }

    public int Get_brightness_bath()
    {
        return this.param_bath.Get_brightness();
    }

    public int Get_light_bath()
    {
        return this.param_bath.Get_light();
    }

    public int Get_vent_speed_bath()
    {
        return this.param_bath.Get_vent_speed();
    }

    public int Get_flag_water()
    {
        return this.Get_flag_water();
    }

    //������� ������� �����
    public void Set_air_temp_bath(double temp)
    {
        this.param_bath.Set_air_temp(temp);
    }

    public void Set_air_hum_bath(double hum)
    {
        this.param_bath.Set_air_hum(hum);
    }

    public void Set_conc_co2_bath(double co2)
    {
        this.param_bath.Set_conc_co2(co2);
    }

    public void Set_brightness_bath(int bright)
    {
        this.param_bath.Set_brightness(bright);
    }

    public void Set_light_bath(int l)
    {
        this.param_bath.Set_light(l);
    }

    public void Set_vent_speed_bath(int speed)
    {
        this.param_bath.Set_vent_speed(speed);
    }

    public void Set_flag_water(int water)
    {
        this.flag_water = water;
    }

    //������� ����� ������ ������
    public void Set_parametrs_bath(double temp, double hum, double co2, int bright, int l, int speed, int water)
    {
        this.param_bath.Set_air_temp(temp);
        this.param_bath.Set_air_hum(hum);
        this.param_bath.Set_conc_co2(co2);
        this.param_bath.Set_brightness(bright);
        this.param_bath.Set_light(l);
        this.param_bath.Set_vent_speed(speed);
        this.flag_water = water;
    }

    //����� ���������� ������ �� �����
    public void DisplayBath()
    {
    	String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
    	
        System.out.println("\n���������� ������� � ������: " + this.Get_air_temp_bath() + " ��");
        System.out.println("��������� ������� � ������: " + this.Get_air_hum_bath() + " %");
        System.out.println("������������ CO2 � ������: " + this.Get_conc_co2_bath() + " %");
        System.out.println("������� ����� � ������: " + this.Get_brightness_bath() + " %");
        System.out.println("������ ����� � ������: " + this.Get_light_bath());
        System.out.println("�������� ���������� � ������: " + this.Get_vent_speed_bath() + " %");
    }

    public void water_bath() throws InterruptedException   //������� ������ ���� � ������
    {
    	String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
    	
        if (this.flag_water == 1)
        {
        	System.out.println("������� ����� ���� � ������...");
            Thread.sleep(5000);
            System.out.println("���� �������!");
        }
    }

    public void menu_bath() // ������� ������ ���� ���������� ��� ������
    {
    	String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
    	
    	System.out.println("\n1. ����������� �������\n"
            + "2. ��������� �������\n"
            + "3. ������������ CO2\n"
            + "4. ������� �����\n"
            + "5. ���������/���������� �����\n"
            + "6. �������� ����������\n"
            + "7. ����� ���� � ������\n"
            + "��������� �����: ");
    }
}
