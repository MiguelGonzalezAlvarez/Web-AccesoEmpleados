package cap.curso.accesos.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Employee
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String dni;
	
	@Column
	private String identificador;
	
	@Column
	private Date fecha_alta;
	
	@Column
	private Date fecha_baja;
	
	@ManyToOne
	private Jornada jornada;

	public Jornada getJornada()
	{
		return jornada;
	}

	public void setJornada(Jornada jornada)
	{
		this.jornada = jornada;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getIdentificador()
	{
		return identificador;
	}

	public void setIdentificador(String identificador)
	{
		this.identificador = identificador;
	}

	public Date getFecha_alta()
	{
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta)
	{
		this.fecha_alta = fecha_alta;
	}

	public Date getFecha_baja()
	{
		return fecha_baja;
	}

	public void setFecha_baja(Date fecha_baja)
	{
		this.fecha_baja = fecha_baja;
	}
	
}
