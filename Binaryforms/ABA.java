import java.util.Scanner;
public class ABA {
    public static Scanner scn=new Scanner(System.in);
    public static void anybaseAddition(int n1,int n2,int b)
    {
        int carry=0;
        int pow=1;
     int   finalanswer=0;
        while(n1>0 || n2>0 || carry>0)
        {
          int d1=n1%10;
          int d2=n2%10;
          
          int ans=d1+d2+carry;
          finalanswer=finalanswer+(ans%b)*pow;
          carry=ans/b;
          pow=pow*10;
          n1/=10;
          n2/=10;
        }
        System.out.println(finalanswer);

    }
    
    public static void main(String[] args) {
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();
        anybaseAddition(n1,n2,b);

        // decimalToanybase(n,b);
       
   }
    
}
import CommonDropdown from './CommonDropdown';
    
import React, { useState } from 'react';
import { Field, Formik } from 'formik';
import {
  InputLabel,
  MenuItem,
  FormControl,
  Select,
  FormHelperText,
} from '@mui/material';

const CommonDropdown = ({
  name,
  label,
  options,
  formikProps,
  error,
  helperText,
  ...rest
}) => {
  return (
    <FormControl fullWidth error={error}>
      <InputLabel htmlFor={name}>{label}</InputLabel>
      <Field
        as={Select}
        name={name}
        labelId={name}
        value={formikProps.values[name] || ''}
        onChange={formikProps.handleChange}
        error={error}
        {...rest}
      >
        {options.map((option) => (
          <MenuItem key={option.value} value={option.value}>
            {option.label}
          </MenuItem>
        ))}
      </Field>
      {error && <FormHelperText>{error}</FormHelperText>}
      {helperText && <FormHelperText>{helperText}</FormHelperText>}
    </FormControl>
  );
};

export default CommonDropdown;

