import React from 'react';
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







import { useFormik } from 'formik';

const MyForm = () => {
  const formik = useFormik({
    initialValues: {
      myField: '', // Initial value for the dropdown
    },
    // ... other formik configuration
  });

  return (
    <Formik onSubmit={formik.handleSubmit}>
      {({ values, touched, errors }) => (
        <form>
          {/* Other form fields */}
          <CommonDropdown
            name="myField"
            label="My Dropdown"
            options={[
              { value: 'option1', label: 'Option 1' },
              { value: 'option2', label: 'Option 2' },
              // ... more options
            ]}
            formikProps={formik}
            error={touched.myField && errors.myField}
            helperText="Choose an option"
          />
          {/* Submit button or other form elements */}
        </form>
      )}
    </Formik>
  );
};

export default MyForm;
