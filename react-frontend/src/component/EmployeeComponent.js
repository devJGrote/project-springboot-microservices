import React, { useState, useEffect } from 'react';
import EmployeeService from '../service/EmployeeService';
import { Container, Card, Typography, Paper, Grid } from '@mui/material';

const EmployeeComponent = () => {
    const [employee, setEmployee] = useState({});
    const [department, setDepartment] = useState({});
    const [organization, setOrganization] = useState({});

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await EmployeeService.getEmployee();
                setEmployee(response.data.employee);
                setDepartment(response.data.department);
                setOrganization(response.data.organization);
            } catch (error) {
                console.error('Error fetching employee data:', error);
            }
        };

        fetchData();
    }, []);

    return (
        <Container sx={{ marginTop: '20px' }}>
            <Card sx={{ width: '100%', marginBottom: '20px' }}>
                <Typography variant="h4" component="h1" sx={{ textAlign: 'center', padding: '20px' }}>
                    View Details
                </Typography>
            </Card>
            <Grid container spacing={2}>
                <Grid item xs={12} md={4}>
                    <Paper sx={{ padding: '20px' }}>
                        <Typography variant="h5" sx={{ marginBottom: '10px' }}>Employee</Typography>
                        <Typography variant="body1">
                            {employee.firstName} {employee.lastName}
                        </Typography>
                        <Typography variant="body1">
                            {employee.email}
                        </Typography>
                    </Paper>
                </Grid>
                <Grid item xs={12} md={4}>
                    <Paper sx={{ padding: '20px' }}>
                        <Typography variant="h5" sx={{ marginBottom: '10px' }}>Department</Typography>
                        <Typography variant="body1">
                            {department.departmentName}
                        </Typography>
                        <Typography variant="body1">
                            {department.departmentDescription}
                        </Typography>
                        <Typography variant="body1">
                            {department.departmentCode}
                        </Typography>
                    </Paper>
                </Grid>
                <Grid item xs={12} md={4}>
                    <Paper sx={{ padding: '20px' }}>
                        <Typography variant="h5" sx={{ marginBottom: '10px' }}>Organization</Typography>
                        <Typography variant="body1">
                            {organization.organizationName}
                        </Typography>
                        <Typography variant="body1">
                            {organization.organizationDescription}
                        </Typography>
                        <Typography variant="body1">
                            {organization.organizationCode}
                        </Typography>
                    </Paper>
                </Grid>
            </Grid>
        </Container>
    );
}

export default EmployeeComponent;
