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


import { useFormik } from 'formik';

const MyForm = () => {
  const [formikProps, setFormikProps] = useState({
    initialValues: {
      myField: '', // Initial value for the dropdown
    },
    // ... other formik configuration
  });

  const handleFormSubmit = (values, actions) => {
    // Handle form submission logic
  };

  return (
    <Formik onSubmit={handleFormSubmit} initialValues={formikProps.initialValues}>
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
            formikProps={{ values, touched, errors }} // Pass formik state
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


import React, { useState } from 'react';
import { Field, Formik } from 'formik';
import {
  InputAdornment,
  IconButton,
  FormControl,
  InputLabel,
  FormHelperText,
  TextField,
  Button,
} from '@mui/material';
import { FileCopyOutlined as FileIcon, CloudUploadOutlined as UploadIcon } from '@mui/icons-material';

const CommonFileUploader = ({
  name,
  label,
  formikProps,
  error,
  helperText,
  accept, // Optional prop to specify allowed file types
  disabled, // Optional prop to disable upload
  multiple, // Optional prop to allow multiple file selection
  onUpload, // Optional callback function for custom upload logic
  ...rest
}) => {
  const [selectedFile, setSelectedFile] = useState(null);

  const handleInputChange = (event) => {
    const file = event.target.files[0];
    setSelectedFile(file);
    formikProps.setFieldValue(name, file); // Update Formik state
  };

  const handleUpload = async (event) => {
    if (!onUpload) {
      // Handle form submission or other actions
      event.preventDefault();
      // ...
    } else {
      event.preventDefault();
      try {
        const response = await onUpload(selectedFile);
        // Handle successful upload logic based on your backend implementation
      } catch (error) {
        // Handle upload errors
        console.error('Upload error:', error);
      }
    }
  };

  return (
    <FormControl fullWidth error={error}>
      <InputLabel htmlFor={name}>{label}</InputLabel>
      <Field
        as={TextField}
        name={name}
        labelId={name}
        value={selectedFile ? selectedFile.name : ''} // Display selected file name
        InputProps={{
          disabled,
          readOnly: true, // Prevent direct input
          endAdornment: (
            <InputAdornment position="end">
              <IconButton component="label" disabled={disabled}>
                <input
                  type="file"
                  hidden
                  accept={accept}
                  multiple={multiple}
                  onChange={handleInputChange}
                />
                {selectedFile ? <FileIcon /> : <UploadIcon />}
              </IconButton>
            </InputAdornment>
          ),
        }}
        {...rest}
      />
      {error && <FormHelperText>{error}</FormHelperText>}
      {helperText && <FormHelperText>{helperText}</FormHelperText>
      {selectedFile && (
        <Button variant="contained" type="submit" disabled={disabled} onClick={handleUpload}>
          Upload
        </Button>
      )}
    </FormControl>
  );
};

export default CommonFileUploader;

import { useFormik } from 'formik';
import { Button } from '@mui/material';

const MyForm = () => {
  const formik = useFormik({
    initialValues: {
      file: null, // Initial value for the file field (optional)
    },
    onSubmit: (values) => {
      const file = values.file;
      // Handle form submission logic here
      // You can access the uploaded file using `file`
      console.log('Uploaded file:', file);
    },
  });

  return (
    <form onSubmit={formik.handleSubmit}>
      {/* Other form fields */}

      <CommonFileUploader
        name="file" // Name of the field in your form
        label="Upload File"
        formikProps={formik}
        accept=".pdf,.docx" // Optional: Restrict file types (e.g., PDF and DOCX)
        // You can add other props like `disabled`, `multiple`, and `onUpload` if needed
      />

      <Button type="submit" variant="contained">
        Submit
      </Button>
    </form>
  );
};

export default MyForm;


