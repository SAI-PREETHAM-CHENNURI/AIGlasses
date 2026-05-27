package com.example.AIGlasses;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0001tB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0005H\u0002J\u0018\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005H\u0002J\u0018\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0002J\b\u0010<\u001a\u00020\u0005H\u0002J\b\u0010=\u001a\u00020\u0005H\u0002J\b\u0010>\u001a\u00020?H\u0002J\u000e\u0010@\u001a\u00020\u0005H\u0082@\u00a2\u0006\u0002\u0010AJ\b\u0010B\u001a\u00020\u0012H\u0002J\b\u0010C\u001a\u00020?H\u0002J\u0018\u0010D\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0002J\b\u0010F\u001a\u00020\u0012H\u0002J\u0018\u0010G\u001a\u00020?2\u0006\u00105\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u0012H\u0002J\u0014\u0010I\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\b\u0010M\u001a\u00020?H\u0016J\b\u0010N\u001a\u00020?H\u0016J\u0010\u0010O\u001a\u00020?2\u0006\u0010P\u001a\u00020\tH\u0016J\"\u0010Q\u001a\u00020\t2\b\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020\tH\u0016J\b\u0010T\u001a\u00020?H\u0002J\b\u0010U\u001a\u00020?H\u0002J\u0018\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0005H\u0002J\b\u0010Y\u001a\u00020?H\u0002J\b\u0010Z\u001a\u00020?H\u0002J\b\u0010[\u001a\u00020?H\u0002J\u0010\u0010\\\u001a\u00020\u00052\u0006\u0010]\u001a\u00020\u0005H\u0002J\u0010\u0010^\u001a\u00020?2\u0006\u0010_\u001a\u00020\u0005H\u0002J\u0010\u0010`\u001a\u00020?2\u0006\u0010a\u001a\u00020\u0005H\u0002J\u001e\u0010b\u001a\u00020?2\u0006\u00105\u001a\u00020\u00052\f\u0010c\u001a\b\u0012\u0004\u0012\u00020?0dH\u0002J\b\u0010e\u001a\u00020?H\u0002J\u0010\u0010f\u001a\u00020?2\u0006\u0010g\u001a\u00020\u0012H\u0002J\b\u0010h\u001a\u00020?H\u0002J\b\u0010i\u001a\u00020?H\u0002J\b\u0010j\u001a\u00020?H\u0002J\b\u0010k\u001a\u00020?H\u0002J\u0018\u0010l\u001a\u00020?2\u0006\u0010m\u001a\u00020\u00052\u0006\u0010n\u001a\u00020oH\u0002J\u0010\u0010p\u001a\u00020?2\u0006\u00105\u001a\u00020\u0005H\u0002J\u0010\u0010q\u001a\u00020?2\u0006\u00105\u001a\u00020\u0005H\u0002J\u0010\u0010r\u001a\u00020\u00052\u0006\u0010s\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0018\u000100R\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006u"}, d2 = {"Lcom/example/AIGlasses/AIGlassesService;", "Landroid/app/Service;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "API_KEY", "", "ESP32_CAPTURE_URL", "ESP32_STATUS_URL", "MAX_HISTORY", "", "MODEL_NAME", "RESPONSE_COOLDOWN_MS", "", "WAKE_COOLDOWN_MS", "WAKE_VOCAB", "accentReceiver", "Landroid/content/BroadcastReceiver;", "appIsInForeground", "", "appStateReceiver", "currentTtsLocale", "Ljava/util/Locale;", "emergencyInFlight", "httpClient", "Lokhttp3/OkHttpClient;", "isRunning", "lastWakeTriggerTime", "listenModeListener", "Lorg/vosk/android/RecognitionListener;", "micPermissionReceiver", "serviceConvHistory", "", "Lorg/json/JSONObject;", "serviceIsVision", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "serviceSessionActive", "speechService", "Lorg/vosk/android/SpeechService;", "tts", "Landroid/speech/tts/TextToSpeech;", "ttsReady", "voskCrashCount", "voskLastCrashTime", "voskModel", "Lorg/vosk/Model;", "voskReady", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "wakeWordListener", "buildNotification", "Landroid/app/Notification;", "text", "buildSmsMessage", "locationUrl", "photoUrl", "callGemini", "prompt", "imageBase64", "captureAndEncodeImage", "captureEsp32Image", "createNotificationChannel", "", "getLocationUrl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasMicPermission", "initVoskBackground", "isExactMatch", "word", "isPhoneLocked", "matchWake", "isPartial", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onInit", "status", "onStartCommand", "flags", "startId", "onWakeVision", "onWakeVoice", "parseVosk", "h", "key", "pauseVosk", "promoteForegroundToMicrophone", "resumeToWakeMode", "saveImageToCache", "base64", "sendEmergencySms", "message", "serviceHandleQuestion", "question", "serviceSpeakThen", "onDone", "Lkotlin/Function0;", "startEsp32PollingLoop", "startServiceSession", "isVision", "startVoskListenMode", "startVoskWakeMode", "stopServiceSession", "triggerEmergency", "unpackModelFromAssets", "assetFolder", "destDir", "Ljava/io/File;", "updateMainActivityStatus", "updateNotification", "uploadToCloudinary", "base64Image", "Companion", "app_debug"})
@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
public final class AIGlassesService extends android.app.Service implements android.speech.tts.TextToSpeech.OnInitListener {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "AIGlassesService";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_ID = "sanj_ai_guardian";
    public static final int NOTIFICATION_ID = 1001;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_WAKE_VOICE = "com.example.AIGlasses.WAKE_VOICE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_WAKE_VISION = "com.example.AIGlasses.WAKE_VISION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_EMERGENCY = "com.example.AIGlasses.EMERGENCY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_MIC_GRANTED = "com.example.AIGlasses.MIC_PERMISSION_GRANTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_APP_FOREGROUND = "com.example.AIGlasses.APP_IN_FOREGROUND";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_APP_BACKGROUND = "com.example.AIGlasses.APP_IN_BACKGROUND";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_ACCENT_CHANGED = "com.example.AIGlasses.ACCENT_CHANGED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_NAME = "sanj_ai_service_prefs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PENDING_MODE = "pending_mode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_EMERGENCY_ACTIVE = "emergency_active";
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.CoroutineScope serviceScope;
    private boolean isRunning = false;
    private boolean ttsReady = false;
    private boolean voskReady = false;
    private boolean emergencyInFlight = false;
    private boolean serviceSessionActive = false;
    private boolean serviceIsVision = false;
    private boolean appIsInForeground = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.json.JSONObject> serviceConvHistory = null;
    private final int MAX_HISTORY = 6;
    private int voskCrashCount = 0;
    private long voskLastCrashTime = 0L;
    private long lastWakeTriggerTime = 0L;
    private final long WAKE_COOLDOWN_MS = 3000L;
    private final long RESPONSE_COOLDOWN_MS = 1500L;
    @org.jetbrains.annotations.Nullable()
    private org.vosk.Model voskModel;
    @org.jetbrains.annotations.Nullable()
    private org.vosk.android.SpeechService speechService;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String WAKE_VOCAB = "[\"vision\", \"voice\", \"emergency\", \"[unk]\"]";
    private android.speech.tts.TextToSpeech tts;
    @org.jetbrains.annotations.NotNull()
    private java.util.Locale currentTtsLocale;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient httpClient = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ESP32_STATUS_URL = "http://192.168.43.17/status";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ESP32_CAPTURE_URL = "http://192.168.43.17/capture";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String API_KEY = "AIzaSyAfPub7egWH1k1zrZhq_dcA05Rl6KUHZJg";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String MODEL_NAME = "gemini-2.5-flash";
    @org.jetbrains.annotations.Nullable()
    private android.os.PowerManager.WakeLock wakeLock;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver micPermissionReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver appStateReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver accentReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private final org.vosk.android.RecognitionListener wakeWordListener = null;
    @org.jetbrains.annotations.NotNull()
    private final org.vosk.android.RecognitionListener listenModeListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.AIGlasses.AIGlassesService.Companion Companion = null;
    
    public AIGlassesService() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void promoteForegroundToMicrophone() {
    }
    
    private final boolean hasMicPermission() {
        return false;
    }
    
    private final void createNotificationChannel() {
    }
    
    private final android.app.Notification buildNotification(java.lang.String text) {
        return null;
    }
    
    private final void updateNotification(java.lang.String text) {
    }
    
    private final void initVoskBackground() {
    }
    
    private final void unpackModelFromAssets(java.lang.String assetFolder, java.io.File destDir) {
    }
    
    private final void startVoskWakeMode() {
    }
    
    private final void startVoskListenMode() {
    }
    
    private final void pauseVosk() {
    }
    
    private final void resumeToWakeMode() {
    }
    
    private final java.lang.String parseVosk(java.lang.String h, java.lang.String key) {
        return null;
    }
    
    private final void matchWake(java.lang.String text, boolean isPartial) {
    }
    
    private final boolean isExactMatch(java.lang.String text, java.lang.String word) {
        return false;
    }
    
    private final boolean isPhoneLocked() {
        return false;
    }
    
    private final void onWakeVoice() {
    }
    
    private final void onWakeVision() {
    }
    
    private final void updateMainActivityStatus(java.lang.String text) {
    }
    
    private final void startServiceSession(boolean isVision) {
    }
    
    private final void stopServiceSession() {
    }
    
    private final void serviceHandleQuestion(java.lang.String question) {
    }
    
    private final void serviceSpeakThen(java.lang.String text, kotlin.jvm.functions.Function0<kotlin.Unit> onDone) {
    }
    
    private final java.lang.String callGemini(java.lang.String prompt, java.lang.String imageBase64) {
        return null;
    }
    
    private final java.lang.String captureAndEncodeImage() {
        return null;
    }
    
    private final java.lang.String saveImageToCache(java.lang.String base64) {
        return null;
    }
    
    private final void startEsp32PollingLoop() {
    }
    
    private final void triggerEmergency() {
    }
    
    private final java.lang.Object getLocationUrl(kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    private final java.lang.String captureEsp32Image() {
        return null;
    }
    
    private final java.lang.String uploadToCloudinary(java.lang.String base64Image) {
        return null;
    }
    
    private final java.lang.String buildSmsMessage(java.lang.String locationUrl, java.lang.String photoUrl) {
        return null;
    }
    
    private final void sendEmergencySms(java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onInit(int status) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/AIGlasses/AIGlassesService$Companion;", "", "()V", "ACTION_ACCENT_CHANGED", "", "ACTION_APP_BACKGROUND", "ACTION_APP_FOREGROUND", "ACTION_EMERGENCY", "ACTION_MIC_GRANTED", "ACTION_WAKE_VISION", "ACTION_WAKE_VOICE", "CHANNEL_ID", "KEY_EMERGENCY_ACTIVE", "KEY_PENDING_MODE", "NOTIFICATION_ID", "", "PREFS_NAME", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}