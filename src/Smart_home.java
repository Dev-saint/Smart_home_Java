import java.util.Scanner;
import java.lang.*;

public class Smart_home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
		
		double t, co2, hum;
        int f_menu_rooms = 0, room, par, f_menu_par = 0, bright, speed, light, coffee, water;
        Toilet toil = new Toilet();
        Kitchen kitch = new Kitchen();
        Bedroom bed = new Bedroom();
        Bathroom bath = new Bathroom();
        Wine_vault wine = new Wine_vault();
        System.out.println("������� ������ ����");
        do
        {
        	System.out.println("�������� �������:\n"
                + "1. ������\n"
                + "2. �����\n"
                + "3. �������\n"
                + "4. ������\n"
                + "5. ������ ������\n"
                + "��������� �������: ");
            room = in.nextInt();
            if (room == 1)
                do
                {
                    toil.menu_toil();
                    par = in.nextInt();
                    if (par == 1)
                    {
                    	System.out.print("\n������� �������� ����������� ������� (� ��): ");
                        t = in.nextDouble();
                        toil.Set_air_temp_toil(t);
                        System.out.println("����������� ������� � ������� ����� �������� �� " + toil.Get_air_temp_toil() + " ��");
                    }
                    else
                        if (par == 2)
                    {
                        System.out.print("\n������� �������� ��������� ������� (� %): ");
                        hum = in.nextDouble();
                        toil.Set_air_hum_toil(hum);
                        System.out.println("��������� ������� � ������� ����� �������� �� " + toil.Get_air_hum_toil() + " %");
                    }
                    else
                        if (par == 3)
                    {
                        System.out.print("\n������� �������� ������������ CO2 (� %): ");
                        co2 = in.nextDouble();
                        toil.Set_conc_co2_toil(co2);
                        System.out.println("������������ CO2 � ������� ����� �������� �� " + toil.Get_conc_co2_toil() + " %");
                    }
                    else
                        if (par == 4)
                    {
                        System.out.print("\n������� �������� ������� ����� (� %): ");
                        bright = in.nextInt();
                        toil.Set_brightness_toil(bright);
                        System.out.println("������� � ������� ����� �������� �� " + toil.Get_brightness_toil() + " %");
                    }
                    else
                        if (par == 5)
                    {
                        	System.out.println("\n�������� (1) ��� ��������� (0) ����?");
                        light = in.nextInt();
                        if (light == 1 && toil.Get_light_toil() != 1)
                        {
                            toil.Set_light_toil(light);
                            System.out.println("���� � ������� �������");
                        }
                        else
                            if (light == 1)
                        {
                            	System.out.println("\n���� ��� �������. ��������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                toil.Set_light_toil(light);
                                System.out.println("���� � ������� ��������");
                            }
                        }
                        else
                                if (toil.Get_light_toil() == 0)
                        {
                                	System.out.println("\n���� ��� ��������. �������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                toil.Set_light_toil(light);
                                System.out.println("���� � ������� �������");
                            }
                        }
                        else
                        {
                            toil.Set_light_toil(light);
                            System.out.println("���� � ������� �������� ");
                        }
                    }
                    else
                        if (par == 6)
                    {
                        System.out.print("\n������� �������� �������� ����������: ");
                        speed = in.nextInt();
                        toil.Set_vent_speed_toil(speed);
                        System.out.println("�������� ���������� � ������� ����� �������� �� " + toil.Get_brightness_toil() + " %");
                    }
                    else
                    {
                    	System.out.println("\n�������� ����� �� ������������!");
                    }
                    System.out.println("\n������� ������� ��� ���� ��������? ��(1)/���(0)");
                    f_menu_par = in.nextInt();
                } while (f_menu_par == 1);
            else
                if (room == 2)
                do
                {
                    kitch.menu_kitch();
                    par = in.nextInt();
                    if (par == 1)
                    {
                    	System.out.print("\n������� �������� ����������� ������� (� ��): ");
                        t = in.nextDouble();;
                        kitch.Set_air_temp_kitch(t);
                        System.out.println("����������� ������� �� ����� ����� �������� �� " + kitch.Get_air_temp_kitch() + " ��");
                    }
                    else
                        if (par == 2)
                    {
                        	System.out.print("\n������� �������� ��������� ������� (� %): ");
                        hum = in.nextDouble();
                        kitch.Set_air_hum_kitch(hum);
                        System.out.println("��������� ������� �� ����� ����� �������� �� " + kitch.Get_air_hum_kitch() + " %");
                    }
                    else
                        if (par == 3)
                    {
                        	System.out.print("\n������� �������� ������������ CO2 (� %): ");
                        co2 = in.nextDouble();
                        kitch.Set_conc_co2_kitch(co2);
                        System.out.println("������������ CO2 �� ����� ����� �������� �� " + kitch.Get_conc_co2_kitch() + " %");
                    }
                    else
                        if (par == 4)
                    {
                        	System.out.print("\n������� �������� ������� ����� (� %): ");
                        bright = in.nextInt();
                        kitch.Set_brightness_kitch(bright);
                        System.out.println("������� ����� �� ����� ����� �������� �� " + kitch.Get_brightness_kitch() + " %");
                    }
                    else
                        if (par == 5)
                    {
                        	System.out.println("�������� (1) ��� ��������� (0) ����?");
                        light = in.nextInt();
                        if (light == 1 && kitch.Get_light_kitch() != 1)
                        {
                            kitch.Set_light_kitch(light);
                            System.out.println("���� �� ����� �������");
                        }
                        else
                            if (light == 1)
                        {
                            	System.out.println("���� ��� �������. ��������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                kitch.Set_light_kitch(light);
                                System.out.println("���� �� ����� ��������");
                            }
                        }
                        else
                            if (kitch.Get_light_kitch() == 0)
                        {
                            	System.out.println("���� ��� ��������. �������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                kitch.Set_light_kitch(light);
                                System.out.println("���� �� ����� �������");
                            }
                        }
                        else
                        {
                            kitch.Set_light_kitch(light);
                            System.out.println("���� �� ����� ��������");
                        }
                    }
                    else
                        if (par == 6)
                    {
                        	System.out.print("������� �������� �������� ����������: ");
                        speed = in.nextInt();
                        kitch.Set_vent_speed_kitch(speed);
                        System.out.println("�������� ���������� �� ����� ����� �������� �� " + kitch.Get_vent_speed_kitch() + " %");
                    }
                    else
                        if (par == 7)
                    {
                        	System.out.println("����������� ����? ��(1)/���(0)");
                        coffee = in.nextInt();
                        kitch.Set_coffee(coffee);
                        kitch.coffee_machine();
                    }
                    else
                    {
                    	System.out.println("�������� ����� �� ������������!");
                    }
                    System.out.println("������� ������� ��� ���� ��������? ��(1)/���(0)");
                    f_menu_par = in.nextInt();
                } while (f_menu_par == 1);
            else
                if (room == 3)
                do
                {
                    bed.menu_bed();
                    par = in.nextInt();
                    if (par == 1)
                    {
                    	System.out.print("������� �������� ����������� ������� (� ��): ");
                        t = in.nextDouble();
                        bed.Set_air_temp_bed(t);
                        System.out.println("����������� ������� � ������� ����� �������� �� " + bed.Get_air_temp_bed() + " ��");
                    }
                    else
                        if (par == 2)
                    {
                        	System.out.print("������� �������� ��������� ������� (� %): ");
                        hum = in.nextDouble();
                        bed.Set_air_hum_bed(hum);
                        System.out.println("��������� ������� � ������� ����� �������� �� " + bed.Get_air_hum_bed() + " %");
                    }
                    else
                        if (par == 3)
                    {
                        	System.out.print("������� �������� ������������ CO2 (� %): ");
                        co2 = in.nextDouble();
                        bed.Set_conc_co2_bed(co2);
                        System.out.println("������������ CO2 � ������� ����� �������� �� " + bed.Get_conc_co2_bed() + " %");
                    }
                    else
                        if (par == 4)
                    {
                        	System.out.print("������� �������� ������� ����� (� %): ");
                        bright = in.nextInt();
                        bed.Set_brightness_bed(bright);
                        System.out.println("������� ����� � ������� ����� �������� �� " + bed.Get_brightness_bed() + " %");
                    }
                    else
                        if (par == 5)
                    {
                        	System.out.println("�������� (1) ��� ��������� (0) ����?");
                        light = in.nextInt();
                        if (light == 1 && bed.Get_light_bed() != 1)
                        {
                            bed.Set_light_bed(light);
                            System.out.println("���� � ������� �������");
                        }
                        else
                            if (light == 1)
                        {
                            	System.out.println("���� ��� �������. ��������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                bed.Set_light_bed(light);
                                System.out.println("���� � ������� ��������");
                            }
                        }
                        else
                            if (bed.Get_light_bed() == 0)
                        {
                            	System.out.println("���� ��� ��������. �������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                bed.Set_light_bed(light);
                                System.out.println("���� � ������� �������");
                            }
                        }
                        else
                        {
                            bed.Set_light_bed(light);
                            System.out.println("���� � ������� ��������");
                        }
                    }
                    else
                        if (par == 6)
                    {
                        	System.out.print("������� �������� �������� ����������: ");
                        speed = in.nextInt();
                        bed.Set_vent_speed_bed(speed);
                        System.out.println("�������� ���������� � ������� ����� �������� �� " + bed.Get_vent_speed_bed() + " %");
                    }
                    else
                    {
                    	System.out.println("�������� ����� �� ������������!");
                    }
                    System.out.println("������� ������� ��� ���� ��������? ��(1)/���(0)");
                    f_menu_par = in.nextInt();
                } while (f_menu_par == 1);
            else
                if (room == 4)
                do
                {
                    bath.menu_bath();
                    par = in.nextInt();
                    if (par == 1)
                    {
                    	System.out.print("������� �������� ����������� ������� (� ��): ");
                        t = in.nextDouble();
                        bath.Set_air_temp_bath(t);
                        System.out.println("����������� ������� � ������ ����� �������� �� " + bath.Get_air_temp_bath() + " ��");
                    }
                    else
                        if (par == 2)
                    {
                        	System.out.print("������� �������� ��������� ������� (� %): ");
                        hum = in.nextDouble();
                        bath.Set_air_hum_bath(hum);
                        System.out.println("��������� ������� � ������ ����� �������� �� " + bath.Get_air_hum_bath() + " %");
                    }
                    else
                        if (par == 3)
                    {
                        	System.out.print("������� �������� ������������ CO2 (� %): ");
                        co2 = in.nextDouble();
                        bath.Set_conc_co2_bath(co2);
                        System.out.println("������������ CO2 � ������ ����� �������� �� " + bath.Get_conc_co2_bath() + " %");
                    }
                    else
                        if (par == 4)
                    {
                        	System.out.print("������� �������� ������� ����� (� %): ");
                        bright = in.nextInt();
                        bath.Set_brightness_bath(bright);
                        System.out.println("������� ����� � ������ ����� �������� �� " + bath.Get_brightness_bath() + " %");
                    }
                    else
                        if (par == 5)
                    {
                        	System.out.println("�������� (1) ��� ��������� (0) ����?");
                        light = in.nextInt();
                        if (light == 1 && bath.Get_light_bath() != 1)
                        {
                            bath.Set_light_bath(light);
                            System.out.println("���� � ������ �������");
                        }
                        else
                            if (light == 1)
                        {
                            	System.out.println("���� ��� �������. ��������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                bath.Set_light_bath(light);
                                System.out.println("���� � ������ ��������");
                            }
                        }
                        else
                            if (bath.Get_light_bath() == 0)
                        {
                            	System.out.println("���� ��� ��������. �������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                bath.Set_light_bath(light);
                                System.out.println("���� � ������ �������");
                            }
                        }
                        else
                        {
                            bath.Set_light_bath(light);
                            System.out.println("���� � ������ ��������");
                        }
                    }
                    else
                        if (par == 6)
                    {
                        	System.out.print("������� �������� �������� ����������: ");
                        speed = in.nextInt();
                        bath.Set_vent_speed_bath(speed);
                        System.out.println("�������� ���������� � ������ ����� �������� �� " + bath.Get_vent_speed_bath() + " %");
                    }
                    else
                        if (par == 7)
                    {
                        	System.out.println("������� ���� � ������? ��(1)/���(0)");
                        water = in.nextInt();
                        bath.Set_flag_water(water);
                        bath.water_bath();
                    }
                    else
                    {
                    	System.out.println("�������� ����� �� ������������!");
                    }
                    System.out.println("������� ������� ��� ���� ��������? ��(1)/���(0)");
                    f_menu_par = in.nextInt();
                } while (f_menu_par == 1);
            else
                if (room == 5)
                do
                {
                    wine.menu_wine();
                    par = in.nextInt();
                    if (par == 1)
                    {
                    	System.out.print("������� �������� ����������� ������� (� ��): ");
                        t = in.nextDouble();
                        wine.Set_air_temp_wine(t);
                        System.out.println("����������� ������� � ������ ������� ����� �������� �� " + wine.Get_air_temp_wine() + " ��");
                    }
                    else
                        if (par == 2)
                    {
                        	System.out.print("������� �������� ��������� ������� (� %): ");
                        hum = in.nextDouble();
                        wine.Set_air_hum_wine(hum);
                        System.out.println("��������� ������� � ������ ������� ����� �������� �� " + wine.Get_air_hum_wine() + " %");
                    }
                    else
                        if (par == 3)
                    {
                        	System.out.print("������� �������� ������������ CO2 (� %): ");
                        co2 = in.nextDouble();
                        wine.Set_conc_co2_wine(co2);
                        System.out.println("������������ CO2 � ������ ������� ����� �������� �� " + wine.Get_conc_co2_wine() + " %");
                    }
                    else
                        if (par == 4)
                    {
                        	System.out.print("������� �������� ������� ����� (� %): ");
                        bright = in.nextInt();
                        wine.Set_brightness_wine(bright);
                        System.out.println("������� ����� � ������ ������� ����� �������� �� " + wine.Get_brightness_wine() + " %");
                    }
                    else
                        if (par == 5)
                    {
                        	System.out.println("�������� (1) ��� ��������� (0) ����?");
                        light = in.nextInt();
                        if (light == 1 && wine.Get_light_wine() != 1)
                        {
                            wine.Set_light_wine(light);
                            System.out.println("���� � ������ �������");
                        }
                        else
                            if (light == 1)
                        {
                            	System.out.println("���� ��� �������. ��������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                wine.Set_light_wine(light);
                                System.out.println("���� � ������ ��������");
                            }
                        }
                        else
                            if (wine.Get_light_wine() == 0)
                        {
                            	System.out.println("���� ��� ��������. �������� ����? ��(1)/���(0)");
                            light = in.nextInt();
                            if (light == 1)
                            {
                                wine.Set_light_wine(light);
                                System.out.println("���� � ������ �������");
                            }
                        }
                        else
                        {
                            wine.Set_light_wine(light);
                            System.out.println("���� � ������ ��������");
                        }
                    }
                    else
                        if (par == 6)
                    {
                        	System.out.print("������� �������� �������� ����������: ");
                        speed = in.nextInt();
                        wine.Set_vent_speed_wine(speed);
                        System.out.println("�������� ���������� � ������ ������� ����� �������� �� " + wine.Get_vent_speed_wine() + " %");
                    }
                    else
                    {
                    	System.out.println("�������� ����� �� ������������!");
                    }
                    System.out.println("������� ������� ��� ���� ��������? ��(1)/���(0)");
                    f_menu_par = in.nextInt();
                } while (f_menu_par == 1);
            else
            {
            	System.out.println("�������� ������� �� ������������!");
            }
            System.out.println("������� ������� ������ �������? ��(1)/���(0)");
            f_menu_rooms = in.nextInt();
            
            System.out.println("\n6) ������������������ ������ � �������� ��������");
    		System.out.println("===========================================================================================");
    		System.out.println("�� ������� �������� ������ ������");
    		
    		Toilet[] mas_toil = new Toilet[4];
    		int j;
    		for (j = 0; j < 4; j++)
    		{
    			mas_toil[j] = new Toilet();
    		}
			mas_toil[0].Set_parametrs_toil(0, 0, 0, 0, 0, 0);
			mas_toil[1].Set_parametrs_toil(0, 0, 0, 60, 0, 0);
			mas_toil[2].Set_parametrs_toil(0, 0, 0, 0, 0, 0);
			mas_toil[3].Set_parametrs_toil(0, 0, 0, 0, 0, 0);
    		int i;
    		for (i=0;i<4;i++)
    		{
    			mas_toil[i].Set_air_temp_toil((i+1)*10);
    			System.out.println("����������� ������� �" + (i+1) + " = " + mas_toil[i].Get_air_temp_toil());
    		}
    		
    		System.out.println("\n7) ������������������ ������� �������������� �������� �� ������ ����� ��������������� �����");
    		System.out.println("===========================================================================================");
    		System.out.println("�� ������� �������� ������ Parametrs � Toilet");
    		
    		Parametrs par1 = new Parametrs();
    		par1 = mas_toil[1].GetParam();
    		System.out.println("����� �������� ������� �����: " + par1.Get_brightness());
    		
    		System.out.println("\n8) ������������������ �������� ������������� ��������� this");
    		System.out.println("===========================================================================================");
    		System.out.println("�� ������� ������ ���������");
    		
    		// ������� ����� ����������� �������� ������ Parametrs:
    		Parametrs[] mas_par = new Parametrs[4];
    		for (j = 0; j < 4; j++)
    		{
    			mas_par[j] = new Parametrs();
    		}
    		
    		mas_par[0].Set_vent_speed(1);
    		mas_par[1].Set_vent_speed(2);
    		mas_par[2].Set_vent_speed(3);
    		mas_par[3].Set_vent_speed(4);
    		
    		mas_par[0].NewList();

    		// ����� ����������� ������������ �������:
    		mas_par[3].reprint();
    		
    		// ��������� ��������� ����������� � ������������ ������:
    		mas_par[0].Add(); mas_par[1].Add(); mas_par[2].Add(); mas_par[3].Add();
    		
    		// ������ � �������� ������� �������� ��������� ������:
    		mas_par[3].reprint();
    		
    		System.out.println("\n9) ������������������ ��������� ����� (String)");
    		System.out.println("===========================================================================================");
    		System.out.println("�� ������� ����� Troitskiy � Prog, ��������� ����� � ��������\n");
    		
    		String Troitskiy = new String();
    		Troitskiy = "��������, ";
    		String Prog = new String();
    		Prog = "��� ��� ������ ���� ����:(";
    		
    		if (Troitskiy.equals(Prog))
    			System.out.println("\n������ �����!");
    		else
    		{
    			Troitskiy = Troitskiy + Prog;
    			System.out.println(Troitskiy + "\n");
    		}
        } while (f_menu_rooms == 1);
    }
	}
