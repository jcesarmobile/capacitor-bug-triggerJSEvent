# create-svelte

Everything you need to build a Svelte project, powered by [`create-svelte`](https://github.com/sveltejs/kit/tree/master/packages/create-svelte).

## Steps to Reproduce

1. Setup Project:

    ```bash
    git clone https://github.com/kimiroo/capacitor-bug-triggerJSEvent.git
    cd .\capacitor-bug-triggerJSEvent
    npm install
    npm run build
    npx cap sync
    npx cap open android
    ```
2. Build an app in Android Studio & install
3. Launch app on phone
4. Click "Run Test" button


## Expected Behavior

Once you've created a project and installed dependencies with `npm install` (or `pnpm install` or `yarn`), start a development server:

```bash
npm run dev

# or start the server and open the app in a new browser tab
npm run dev -- --open
```

## Actual Behavior

To create a production version of your app:

```bash
npm run build
```

You can preview the production build with `npm run preview`.

> To deploy your app, you may need to install an [adapter](https://kit.svelte.dev/docs/adapters) for your target environment.
"# capacitor-bug-triggerJSEvent" 
