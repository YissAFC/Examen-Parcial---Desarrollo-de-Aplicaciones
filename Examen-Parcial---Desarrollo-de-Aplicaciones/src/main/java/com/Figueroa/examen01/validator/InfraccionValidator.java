package com.Figueroa.examen01.validator;

import com.Figueroa.examen01.entity.Infraccion;
import com.Figueroa.examen01.exception.ValidateException;

public class InfraccionValidator {
    public static void save(Infraccion infraccion) {
        if (infraccion.getDni() == null || infraccion.getDni().isEmpty()) {
            throw new ValidateException("El DNI del producto no puede ser nulo o vacío.");
        }
        if (infraccion.getDescripcion() == null || infraccion.getDescripcion().isEmpty()) {
            throw new ValidateException("La descripción del producto no puede ser nula o vacía.");
        }
        if (infraccion.getPlaca() == null || infraccion.getPlaca().isEmpty()) {
            throw new ValidateException("La placa del producto no puede ser nula o vacía.");
        }
        if (infraccion.getInfracción() == null || infraccion.getInfracción().isEmpty()) {
            throw new ValidateException("La infracción del producto no puede ser nula o vacía.");
        }
        if (infraccion.getDni().length() > 8) {
            throw new ValidateException("El DNI del producto debe tener como maximo 8 caracteres.");
            
        }
        if (infraccion.getPlaca().length() > 7) {
            throw new ValidateException("La placa del producto debe tener como maximo 7 caracteres.");
            
        }
        if (infraccion.getDescripcion().length()>255) {
            throw new ValidateException("La descripción del producto debe tener como maximo 255 caracteres.");
            
        }
        if (infraccion.getDescripcion().length()>200) {
            throw new ValidateException("La infracción del producto debe tener como maximo 200 caracteres.");
            
        }
    }
}
