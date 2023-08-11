import { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'com.capacitor.reproduction.triggerJSEvent',
  appName: 'capacitorTriggerJSEventReproduction',
  webDir: 'build',
  server: {
    androidScheme: 'https'
  }
};

export default config;
