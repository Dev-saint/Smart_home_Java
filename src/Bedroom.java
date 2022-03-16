import java.util.Scanner;

public class Bedroom {
	private Parametrs param_bed = new Parametrs();

    //�����������
    public Bedroom()
    {
        this.param_bed.Set_parametrs(0, 0, 0, 0, 0, 0);
    }

    //������� ��������� ������ �� �����
    public double Get_air_temp_bed()
    {
        return this.param_bed.Get_air_temp();
    }

    public double Get_air_hum_bed()
    {
        return this.param_bed.Get_air_hum();
    }

    public double Get_conc_co2_bed()
    {
        return this.param_bed.Get_conc_co2();
    }

    public int Get_brightness_bed()
    {
        return this.param_bed.Get_brightness();
    }

    public int Get_light_bed()
    {
        return this.param_bed.Get_light();
    }

    public int Get_vent_speed_bed()
    {
        return this.param_bed.Get_vent_speed();
    }

    //������� ������� �����
    public void Set_air_temp_bed(double temp)
    {
        this.param_bed.Set_air_temp(temp);
    }

    public void Set_air_hum_bed(double hum)
    {
        this.param_bed.Set_air_hum(hum);
    }

    public void Set_conc_co2_bed(double co2)
    {
        this.param_bed.Set_conc_co2(co2);
    }

    public void Set_brightness_bed(int bright)
    {
        this.param_bed.Set_brightness(bright);
    }

    public void Set_light_bed(int l)
    {
        this.param_bed.Set_light(l);
    }

    public void Set_vent_speed_bed(int speed)
    {
        this.param_bed.Set_vent_speed(speed);
    }

    //������� ����� ������ �������
    public void Set_parametrs_bed(double temp, double hum, double co2, int bright, int l, int speed, int cof)
    {
        this.param_bed.Set_air_temp(temp);
        this.param_bed.Set_air_hum(hum);
        this.param_bed.Set_conc_co2(co2);
        this.param_bed.Set_brightness(bright);
        this.param_bed.Set_light(l);
        this.param_bed.Set_vent_speed(speed);
    }

    //����� ���������� ������� �� �����
    public void DisplayBed()
    {
    	String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
    	
        System.out.println("\n���������� ������� � �������: " + this.Get_air_temp_bed() + " ��");
        System.out.println("��������� ������� � �������: " + this.Get_air_hum_bed() + " %");
        System.out.println("������������ CO2 � �������: " + this.Get_conc_co2_bed() + " %");
        System.out.println("������� ����� � �������: " + this.Get_brightness_bed() + " %");
        System.out.println("������ ����� � �������: " + this.Get_light_bed());
        System.out.println("�������� ���������� � �������: " + this.Get_vent_speed_bed() + " %");
    }

    public void menu_bed() // ������� ������ ���� ���������� �������
    {
    	String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
    	
    	System.out.println("1. ����������� �������\n"
            + "2. ��������� �������\n"
            + "3. ������������ CO2\n"
            + "4. ������� �����\n"
            + "5. ���������/���������� �����\n"
            + "6. �������� ����������\n"
            + "��������� �����: ");
    }
}
