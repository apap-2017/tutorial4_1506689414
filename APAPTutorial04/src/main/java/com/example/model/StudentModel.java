package com.example.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel
{
	
	@NotNull
    private String npm;
    
	@NotNull
    private String name;

    @NotNull
    private double gpa;

    
    public String getNpm() {
		return npm;
   	}
    
    public void setNpm(String npm) {
    	this.npm=npm;
    }
    
    public String getName() {
  		return name;
      	
      }
      
      public void setName(String name) {
      	this.name=name;
      }
      
      
      public double getGpa() {
  		return gpa;
      	
      }
      
      public void setGpa(double gpa) {
      	this.gpa=gpa;
      }
}
