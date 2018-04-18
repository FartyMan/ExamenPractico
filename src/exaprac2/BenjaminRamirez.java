package exaprac2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *  Nombre de la clase:  Benjamin Ramirez
 * Fecha: 18 de Abril de 2018
 * Version 1.0
 * CopyRight: ITCA-FEPADE
 * @author Benjamín Ramírez
 */
public class BenjaminRamirez {

    public static void main(String[] args) {
        int resp=0, n, j=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos alumnos dese procesar?"));
        String  nombre[]= new String[n];
        double  nota1[]= new double[n];
        double  nota2[]= new double[n];
        double  nota3[]= new double[n];
        double promedio[]=new double[n];
        String estado[]=new String[n];
        int  edad[]= new int[n];
        DecimalFormat df= new DecimalFormat("##.##");
        do{
            resp=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione el número de la acción desea realizar (Escriba -1 para salir del programa): \n[1]Nuevo registro\n[2]Mostrar Listado"));
            while(resp==1){
                if(j<n){
                    nombre[j]=JOptionPane.showInputDialog("Ingrese el nombre del Estudiante "+(j+1));
                    nota1[j]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Nota 1 del Estudiante "+(j+1)));
                    nota2[j]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Nota 2 del Estudiante "+(j+1)));
                    nota3[j]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Nota 3 del Estudiante "+(j+1)));
                    edad[j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Estudiante "+(j+1)));
                    promedio[j]=(nota1[j]+nota2[j]+nota3[j])/3;
                    if((nota1[j]<0 || nota1[j]>10)||(nota2[j]<0 || nota2[j]>10) || (nota3[j]<0 || nota3[j]>10)){
                        JOptionPane.showMessageDialog(null,"¡¡IMPOSIBLE CALCULAR PROMEDIO!! ¡¡Datos de notas inválidos!!");
                        j=j-1;
                    }
                    if(promedio[j]<7 && promedio[j]>=0){
                        estado[j]="REPROBADO";
                    }
                    if(promedio[j]>=7 && promedio[j]<=10)
                    {
                        estado[j]="APROBADO";
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Ya ha llenado todos los registros posibles");
                }
                j++;
                resp=0;
            }
           
            if(resp==2){
                    for(int i=0;i<j;i++){
                        JOptionPane.showMessageDialog(null,"ESTUDIANTE "+(i+1)+"\nNombre: "+nombre[i]+"\nNota1: "+df.format(nota1[i])+
                                "\nNota2: "+df.format(nota2[i])+"\nNota3: "+df.format(nota3[i])+"\nPromedio Final: "+df.format(promedio[i])+"\nEdad: "+edad[i]+"\nEstado: "+estado[i]);
                    }
            }
        }while(resp!=-1);
    }
    
}
