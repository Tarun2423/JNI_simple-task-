#include <jni.h>

extern "C" {

JNIEXPORT jdouble JNICALL Java_CircleCalculator_calculateAreaOfCircle(JNIEnv *env, jobject obj, jint radius) {
    if (radius <= 0) {
        jclass exceptionClass = env->FindClass("NativeCalculationException");

        if (exceptionClass != nullptr) {
            env->ThrowNew(exceptionClass, "Invalid radius. Radius must be greater than zero.");
        }

        
        return -1.0;
    }

   
    const double PI = 3.14159;
    return PI * radius * radius;
}

}  
