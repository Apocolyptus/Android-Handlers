@Override
public void run() {
  try {
    Looper.prepare();
    handler = new Handler();
    Looper.loop();
  } catch (Throwable t) {
    Log.e(TAG, "halted due to an error", t);
  } 
}
