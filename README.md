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
