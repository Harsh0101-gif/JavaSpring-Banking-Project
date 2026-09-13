document.querySelectorAll('form').forEach(form => {

    form.addEventListener('submit', e => {

        if (form.closest('.form-card')) {

            e.preventDefault();

            alert(
                'Request submitted successfully. Connect this form to your Spring Boot service.'
            );
        }

    });

});