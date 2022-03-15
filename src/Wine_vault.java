import java.util.Scanner;

public class Wine_vault {
	private Parametrs param_wine = new Parametrs();

    //�����������
    public Wine_vault()
    {
        this.param_wine.Set_parametrs(0, 0, 0, 0, 0, 0);
    }

    //������� ��������� ������ �� �����
    public double Get_air_temp_wine()
    {
        return this.param_wine.Get_air_temp();
    }

    public double Get_air_hum_wine()
    {
        return this.param_wine.Get_air_hum();
    }

    public double Get_conc_co2_wine()
    {
        return this.param_wine.Get_conc_co2();
    }

    public int Get_brightness_wine()
    {
        return this.param_wine.Get_brightness();
    }

    public int Get_light_wine()
    {
        return this.param_wine.Get_light();
    }

    public int Get_vent_speed_wine()
    {
        return this.param_wine.Get_vent_speed();
    }

    //������� ������� �����
    public void Set_air_temp_wine(double temp)
    {
        this.param_wine.Set_air_temp(temp);
    }

    public void Set_air_hum_wine(double hum)
    {
        this.param_wine.Set_air_hum(hum);
    }

    public void Set_conc_co2_wine(double co2)
    {
        this.param_wine.Set_conc_co2(co2);
    }

    public void Set_brightness_wine(int bright)
    {
        this.param_wine.Set_brightness(bright);
    }

    public void Set_light_wine(int l)
    {
        this.param_wine.Set_light(l);
    }

    public void Set_vent_speed_wine(int speed)
    {
        this.param_wine.Set_vent_speed(speed);
    }

    //������� ����� ������ ������ ������
    public void Set_parametrs_wine(double temp, double hum, double co2, int bright, int l, int speed)
    {
        this.param_wine.Set_air_temp(temp);
        this.param_wine.Set_air_hum(hum);
        this.param_wine.Set_conc_co2(co2);
        this.param_wine.Set_brightness(bright);
        this.param_wine.Set_light(l);
        this.param_wine.Set_vent_speed(speed);
    }

    //����� ���������� ������� ������� �� �����
    public void DisplayWine()
    {
    	String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
    	
        System.out.println("\n���������� ������� � ������ �������: " + this.Get_air_temp_wine() + " ��");
        System.out.println("��������� ������� � ������ �������: " + this.Get_air_hum_wine() + " %");
        System.out.println("������������ CO2 � ������ �������: " + this.Get_conc_co2_wine() + " %");
        System.out.println("������� ����� � ������ �������: " + this.Get_brightness_wine() + " %");
        System.out.println("������ ����� � ������ �������: " + this.Get_light_wine());
        System.out.println("�������� ���������� � ������ �������: " + this.Get_vent_speed_wine() + " %");
    }

    public void menu_wine() // ������� ������ ���� ���������� ��� ������� �������
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
            + "��������� �����: ");
    }
}
