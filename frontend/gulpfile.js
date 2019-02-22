var gulp = require('gulp');

gulp.task('copy', function() {
   return gulp.src('build/**/*')
        .pipe(gulp.dest('../backend/src/main/resources/static/'))
});
