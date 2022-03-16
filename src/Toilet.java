import java.util.*;

public class Toilet {
	private Parametrs param_toil = new Parametrs(); // ��������� �������

	// �����������
	public Toilet() {
		this.param_toil.Set_parametrs(0, 0, 0, 0, 0, 0);
	}

	// ����������� � ����� ����������
	public Toilet(double temp) {
		this.param_toil.Set_parametrs(temp, 0, 0, 0, 0, 0);
	}

	// ����������� � �����������
	public Toilet(double temp, double hum, double co2, int bright, int l, int speed) {
		this.param_toil.Set_parametrs(temp, hum, co2, bright, l, speed);
	}

	// ������� ��������� ������ �� �����
	public double Get_air_temp_toil() {
		return this.param_toil.Get_air_temp();
	}

	public double Get_air_hum_toil() {
		return this.param_toil.Get_air_hum();
	}

	public double Get_conc_co2_toil() {
		return this.param_toil.Get_conc_co2();
	}

	public int Get_brightness_toil() {
		return this.param_toil.Get_brightness();
	}

	public int Get_light_toil() {
		return this.param_toil.Get_light();
	}

	public int Get_vent_speed_toil() {
		return this.param_toil.Get_vent_speed();
	}

	// ������� ������� �����
	public void Set_air_temp_toil(double temp) {
		this.param_toil.Set_air_temp(temp);
	}

	public void Set_air_hum_toil(double hum) {
		this.param_toil.Set_air_hum(hum);
	}

	public void Set_conc_co2_toil(double co2) {
		this.param_toil.Set_conc_co2(co2);
	}

	public void Set_brightness_toil(int bright) {
		this.param_toil.Set_brightness(bright);
	}

	public void Set_light_toil(int l) {
		this.param_toil.Set_light(l);
	}

	public void Set_vent_speed_toil(int speed) {
		this.param_toil.Set_vent_speed(speed);
	}

	// ������� ����� ������ ������
	public void Set_parametrs_toil(double temp, double hum, double co2, int bright, int l, int speed) {
		this.param_toil.Set_air_temp(temp);
		this.param_toil.Set_air_hum(hum);
		this.param_toil.Set_conc_co2(co2);
		this.param_toil.Set_brightness(bright);
		this.param_toil.Set_light(l);
		this.param_toil.Set_vent_speed(speed);
	}

	// ����� ���������� ������� �� �����
	public void DisplayToil() {
		String os = System.getProperty("os.name");
		String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
		Scanner in = new Scanner(System.in, consoleEncoding);

		System.out.println("\n���������� ������� � �������: " + this.Get_air_temp_toil() + " ��");
		System.out.println("��������� ������� � �������: " + this.Get_air_hum_toil() + " %");
		System.out.println("������������ CO2 � �������: " + this.Get_conc_co2_toil() + " %");
		System.out.println("������� ����� � �������: " + this.Get_brightness_toil() + " %");
		System.out.println("������ ����� � �������: " + this.Get_light_toil());
		System.out.println("�������� ���������� � �������: " + this.Get_vent_speed_toil() + " %");
	}

	public void menu_toil() // ������� ������ ���� ���������� ��� �������
	{
		String os = System.getProperty("os.name");
		String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
		Scanner in = new Scanner(System.in, consoleEncoding);

		System.out.println(
				"1. ����������� �������\n" + "2. ��������� �������\n" + "3. ������������ CO2\n" + "4. ������� �����\n"
						+ "5. ���������/���������� �����\n" + "6. �������� ����������\n" + "��������� �����: ");
	}

	public Parametrs GetParam() {
		return param_toil;
	}
}
