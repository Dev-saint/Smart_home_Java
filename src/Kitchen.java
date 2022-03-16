import java.util.Scanner;
import java.lang.*;

public class Kitchen {
	        private int coffee; //������������� ���� ����� ���
	        private Parametrs param_kitch = new Parametrs();

	        //�����������
	        public Kitchen()
	        {
	            this.param_kitch.Set_parametrs(0, 0, 0, 0, 0, 0);
	            this.coffee = 0;
	        }

	        //������� ��������� ������ �� �����
	        public double Get_air_temp_kitch()
	        {
	            return this.param_kitch.Get_air_temp();
	        }

	        public double Get_air_hum_kitch()
	        {
	            return this.param_kitch.Get_air_hum();
	        }

	        public double Get_conc_co2_kitch()
	        {
	            return this.param_kitch.Get_conc_co2();
	        }

	        public int Get_brightness_kitch()
	        {
	            return this.param_kitch.Get_brightness();
	        }

	        public int Get_light_kitch()
	        {
	            return this.param_kitch.Get_light();
	        }

	        public int Get_vent_speed_kitch()
	        {
	            return this.param_kitch.Get_vent_speed();
	        }

	        public int Get_coffee()
	        {
	            return this.coffee;
	        }

	        //������� ������� �����
	        public void Set_air_temp_kitch(double temp)
	        {
	            this.param_kitch.Set_air_temp(temp);
	        }

	        public void Set_air_hum_kitch(double hum)
	        {
	            this.param_kitch.Set_air_hum(hum);
	        }

	        public void Set_conc_co2_kitch(double co2)
	        {
	            this.param_kitch.Set_conc_co2(co2);
	        }

	        public void Set_brightness_kitch(int bright)
	        {
	            this.param_kitch.Set_brightness(bright);
	        }

	        public void Set_light_kitch(int l)
	        {
	            this.param_kitch.Set_light(l);
	        }

	        public void Set_vent_speed_kitch(int speed)
	        {
	            this.param_kitch.Set_vent_speed(speed);
	        }

	        public void Set_coffee(int cof)
	        {
	            this.coffee = cof;
	        }

	        //������� ����� ������ �����
	        public void Set_parametrs_kitch(double temp, double hum, double co2, int bright, int l, int speed, int cof)
	        {
	            this.param_kitch.Set_air_temp(temp);
	            this.param_kitch.Set_air_hum(hum);
	            this.param_kitch.Set_conc_co2(co2);
	            this.param_kitch.Set_brightness(bright);
	            this.param_kitch.Set_light(l);
	            this.param_kitch.Set_vent_speed(speed);
	            this.coffee = cof;
	        }

	        //����� ���������� ����� �� �����
	        public void DisplayKitch()
	        {
	        	String os = System.getProperty("os.name");
	            String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
	            Scanner in = new Scanner(System.in, consoleEncoding);
	        	
	            System.out.println("\n���������� ������� �� �����: " + this.Get_air_temp_kitch() + " ��");
	            System.out.println("��������� ������� �� �����: " + this.Get_air_hum_kitch() + " %");
	            System.out.println("������������ CO2 �� �����: " + this.Get_conc_co2_kitch() + " %");
	            System.out.println("������� ����� �� �����: " + this.Get_brightness_kitch() + " %");
	            System.out.println("������ ����� �� �����: " + this.Get_light_kitch());
	            System.out.println("�������� ���������� �� �����: " + this.Get_vent_speed_kitch() + " %");
	        }

	        public void coffee_machine() throws InterruptedException //������� ������������� ����
	        {
	        	String os = System.getProperty("os.name");
	            String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
	            Scanner in = new Scanner(System.in, consoleEncoding);
	        	
	            if (this.coffee == 1)
	            {
	            	System.out.println("���� ���������...");
	                Thread.sleep(5000);
	                System.out.println("���� �����!");
	            }
	        }

	        public void menu_kitch() // ������� ������ ���� ���������� ��� �����
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
	                + "7. ������������� ����\n"
						+ "��������� �����: ");
			}
}
